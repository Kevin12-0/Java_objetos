package src.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

/* titutlo no extiende de object
 * por que java lo hace por debajo
 */
public class Titulo implements Comparable<Titulo> {
    /* obtener de un Json el nombre */
    @SerializedName("Title")
    private String nombre;
    /* obtener de un Json el año */
    @SerializedName("Year")
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDelasEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituleOmdb miOtherTitle) {
        this.nombre = miOtherTitle.Title();
        /* convertir texto a entero */
        this.fechaDeLanzamiento = Integer.valueOf(miOtherTitle.Year());
        if (miOtherTitle.Runtime().contains("N/A")) {
            throw new ErrorEnCobvecionDuracion("No se puede convertir la duracion Contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(miOtherTitle.Runtime().substring(0, 3).replace(" ", ""));
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDurationInMinutes() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public void setData(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuration(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalEvaluaciones() {
        return totalDelasEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("El nombre de la película es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + getDurationInMinutes());
    }

    public void evaluacion(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDelasEvaluaciones++;
    }

    public double calcularMedia() {
        return sumaDeLasEvaluaciones / totalDelasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otherTitule) {
        return this.getNombre().compareTo(otherTitule.getNombre());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: " + nombre + " Year:" + fechaDeLanzamiento + ", duracion: " + duracionEnMinutos;

    }
}