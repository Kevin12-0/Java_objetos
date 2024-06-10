package src.com.alura.screenmatch.Principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import src.com.alura.screenmatch.modelos.ErrorEnCobvecionDuracion;
import src.com.alura.screenmatch.modelos.TituleOmdb;
import src.com.alura.screenmatch.modelos.Titulo;

public class MainApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Definir el Scanner
        Scanner reed = new Scanner(System.in);

        // Crear instancia de Gson con políticas de nombrado
        Gson gsonData = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting()
                .create();

        // Lista para almacenar los títulos
        List<Titulo> titulos = new ArrayList<>();

        // Realizar varias consultas
        while (true) {
            // Preguntar por el nombre de la película
            System.out.println("Escriba el nombre de una pelicula: ");
            // Leer la respuesta y almacenarla
            var search = reed.nextLine();

            // Condición para salir del bucle
            if (search.equalsIgnoreCase("salir")) {
                break;
            }

            // Concatenar a la variable URL y reemplazar espacios por '+'
            String url = "http://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=14991e95";

            // Conexión con la API
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url)).build();
                // HTTP request
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                // Guardar el JSON
                String json = response.body();
                // Imprimir el JSON
                System.out.println(json);

                // Convertir el JSON a la clase TituleOmdb
                TituleOmdb miTituloOmdb = gsonData.fromJson(json, TituleOmdb.class);
                // Imprimir los datos requeridos
                System.out.println(miTituloOmdb);

                // Generar una instancia de Titulo usando TituleOmdb
                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Informacion del titulo: " + miTitulo);

                // Añadir el título a la lista
                titulos.add(miTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Error ---> " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error URL -->" + e);
            } catch (ErrorEnCobvecionDuracion e) {
                System.out.println("Error Inesperado ----> " + e.getMessage());
            }
        }

        // Cerrar el Scanner
        reed.close();

        // Escribir la lista de títulos en un archivo
        FileWriter logger = new FileWriter("peliculasLogger.txt");
        logger.write(gsonData.toJson(titulos));
        logger.close();

        System.out.println("Finish");
    }
}
