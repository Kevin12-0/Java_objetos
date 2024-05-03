package src.com.alura.java.screenmatch;

public class Pelicula {
    /* atributos de una clase */
    private String nombre;
    private int fechaDeLanzamiento;

    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    /*
     * modificador de las evaluaciones
     * private
     * public
     */
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int fechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int duracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setName(String nombre) {
        /* referirir la varibale a a un atributo */
        this.nombre = nombre;
    }

    public void setData(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuration(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setInclude(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    /* obtener datos de una variable privada */
    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    /*
     * creando metodo que imprimie la informacion de la pelicula
     *
     */
    public void muestraFichaTecnica() {
        System.out.println("El nombre de la pelicula es: " + nombre + " y su fecha de lanzamiento es: "
                + fechaDeLanzamiento);
    }

    /* creando metodo que reciba un parametro */
    public void evaluacion(double nota) {
        /* la suma de las evaluaciones se asignan a nota */
        sumaDeEvaluaciones += nota;
        /* contador de total de evaluaciones */
        totalEvaluaciones++;
    }

    public double calcularMedia() {
        /* calcular la media de las evalaciones */
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}