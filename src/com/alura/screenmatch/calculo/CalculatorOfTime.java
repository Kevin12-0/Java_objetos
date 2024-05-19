package src.com.alura.screenmatch.calculo;

import src.com.alura.screenmatch.modelos.Pelicula;

public class calculatotOfTime {
    private int totalTime;

    public void incluides(Pelicula pelicula) {
        totalTime+= pelicula.getDurationInMinutes();
    }
}
