package src.com.alura.screenmatch.calculo;

import src.com.alura.screenmatch.modelos.Pelicula;
import src.com.alura.screenmatch.modelos.Serie;
import src.com.alura.screenmatch.modelos.Titulo;

public class CalculatorOfTime {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    // recibe una pelicula
//    public void incluides(Pelicula pelicula) {
//        totalTime += pelicula.getDurationInMinutes();
//    }

//    public void incluides(Serie serie) {
//        totalTime += serie.getDurationInMinutes();
//    }

    public void incluides(Titulo titulo) {
        this.totalTime += titulo.getDurationInMinutes();
    }

}
