package src.com.alura.screenmatch.Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import src.com.alura.screenmatch.modelos.Pelicula;
import src.com.alura.screenmatch.modelos.Serie;
import src.com.alura.screenmatch.modelos.Titulo;

public class MainList {
    public static void main(String[] args) {
        /* peliculas */
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evaluacion(9);
        Pelicula otraPelicula = new Pelicula("Terminator", 1998);
        otraPelicula.evaluacion(6);
        var peliculaDeKevin = new Pelicula("Señor de los anillos", 2021);
        peliculaDeKevin.evaluacion(10);

        Pelicula m1 = peliculaDeKevin;
        /* serie */
        Serie kobraKai = new Serie("Kobra Kai", 2017);
        /*
         * lista de peliculas & series
         *
         * para resolver y que no aparezcan en modo antiguo, puedes hacerlo con object
         */
        ArrayList<Titulo> list = new ArrayList<>();
        /* agregar items al array list */
        list.add(miPelicula);
        list.add(otraPelicula);
        list.add(peliculaDeKevin);
        /* se llama en modo antiguoo */
        list.add(kobraKai);
        /* llamar a cada elemento por su item */
        for (Titulo item : list) {
            System.out.println(item.getNombre());
            /*
             * solucionar error
             * la instancia es del tipo Pelicula
             */
            if (item instanceof Pelicula movie && movie.getClassification() > 2) {
                System.out.println(movie.getClassification());
            }
        }

        ArrayList<String> listArtist = new ArrayList<>();
        listArtist.add("Penelopa Cruz");
        listArtist.add("Antonio Banderas");
        listArtist.add("Silvester Stalong");

        System.out.println("Lista de artistas ordenada: " + listArtist);
        /* ordenar lista por orden alfabetico */
        Collections.sort(listArtist);
        System.out.println("Lista de artistas ordenada: " + listArtist);

        Collections.sort(list);
        System.out.println("Lista de titulos oprdenados " + list);

        list.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista ordenada por fecha: " + list);
    }

}
