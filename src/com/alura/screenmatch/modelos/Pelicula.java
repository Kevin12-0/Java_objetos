package src.com.alura.screenmatch.modelos;

import src.com.alura.screenmatch.calculo.Classification;

/* extends sirve para que una clase herede de una clase principal
 * ejemplo:
 *
 * Pelicula hereda atributos de Titulo(clase Principal)
 */                                 // Implementaar una interfas
public class Pelicula extends Titulo implements Classification {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // llamara a una interfaz
    @Override
    public int getClassification() {
        // casteo
        return (int) calcularMedia() / 2;
    }
}