package src.com.alura.screenmatch.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

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
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)).build();
        /* http request */
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        /* obtener el json */
        System.out.println(response.body());

        Gson gson = new Gson();
    }

}
