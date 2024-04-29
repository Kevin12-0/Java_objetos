package src;

public class Pelicula {
    /* atributos de una clase */
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    /* modificador de las evaluaciones 
     * private
     * public
     */
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;
    /* obtener datos de una variable privada */
    int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

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
        /* la suma de las evaluaciones se asignan a nota */
        sumaDeEvaluaciones += nota;
        /* contador de total de evaluaciones */
        totalEvaluaciones++;
    }

    double calcularMedia() {
        /* calcular la media de las evalaciones */
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}