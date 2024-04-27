package src;

public class Pelicula {
    /* atributos de una clase */
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeEvaluaciones;
    int totalEvaluaciones;

    /*
     * creando metodo que imprimie la informacion de la pelicula
     * 
     */
    void muestraFichaTecnica() {
        System.out.println("El nombre de la pelicula es: " + nombre + " y su fecha de lanzamiento es: "
                + fechaDeLanzamiento);
    }

    /* creando metodo que reciba un parametro */
    void evaluacion(double nota) {
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    double calcularMedia() {
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}