package src.com.alura.java.screenmatch;
/* extends sirve para que una clase herede de una clase principal
 * ejemplo:
 * 
 * Pelicula hereda atributos de Titulo(clase Principal) 
 */
public class Pelicula extends Titulo{
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}