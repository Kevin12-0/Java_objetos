package src.com.alura.screenmatch.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import src.com.alura.screenmatch.modelos.TituleOmdb;
import src.com.alura.screenmatch.modelos.Titulo;

public class MainApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        /* definimos el scanner */
        Scanner reed = new Scanner(System.in);
        /* pregunta el nombre de la pelicula */
        System.out.println("Escriba el nombre de una pelicula: ");
        /* lee tu respuesta y la almacena */
        var search = reed.nextLine();
        /* se concatena a la variable url */
        String url = "http://www.omdbapi.com/?t=" + search + "&apikey=14991e95";
        /* conexion con la api */
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url)).build();
            /* http request */
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            /* guardar el Json */
            String json = response.body();
            /* obtener el json */
            System.out.println(json);

            /* variable para usar Gson */
            Gson gson = new Gson();
            /* convertirlo a clase */

            /* Titulo mititulo = gson.fromJson(json, Titulo.class); */
            TituleOmdb mitituloOmdb = gson.fromJson(json, TituleOmdb.class);
            /* impimir el los datos requeridos */
            System.out.println(mitituloOmdb);
            /*
             * este código crea un objeto Gson que durante la serialización y
             * deserialización de objetos JSON aplicará la política UPPER_CAMEL_CASE para
             * los nombres de los campos. Esto puede ser útil si los nombres de los campos
             * en tu código Java no coinciden con las convenciones de nombrado estándar de
             * JSON (lower camel case).
             */
            Gson gsonData = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            /* generar una estancia de un objeto */
            TituleOmdb miOtherTitle = gsonData.fromJson(json, TituleOmdb.class);
            /* imprimir el resultado en consola */

            System.out.println(miOtherTitle);
            /* manejo de errores */

            Titulo mititulo = new Titulo(miOtherTitle);
            System.out.println("Informacion del titutlo: " + mititulo);
            /* error de numero */
        } catch (NumberFormatException e) {
            System.out.println("Error ---> " + e.getMessage());
            /* erro de argumento */
        } catch (IllegalArgumentException e) {
            System.out.println("error url -->" + e);
            /* error general */
        } catch (Exception e) {
            System.out.println("Error Inesperado ---->" + e);
        }
        System.out.println("Finish");

    }

}
