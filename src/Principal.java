package src;

public class Principal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Pelicula => tipo de dato
         * new Pelicula => espacio para el objeto
         */
        Pelicula miPelicula = new Pelicula();
        /* asignar valores a atributos de la clase */
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;
        /* llamando a un metodo */
        miPelicula.muestraFichaTecnica();
        /* llamando a metodo de evaluar pelicula */
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(9);
        miPelicula.evaluacion(8);
        miPelicula.evaluacion(8);
        /* llamando a metodo que suma las evaluaciones */
        System.out.println(miPelicula.sumaDeEvaluaciones);
        /* saber el total de evaluaciones */
        System.out.println(miPelicula.totalEvaluaciones);
        /* llamando a metodo pára calcualr la media */
        System.out.println(miPelicula.calcularMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.duracionEnMinutos = 218;
        otraPelicula.fechaDeLanzamiento = 1999;
        otraPelicula.nombre = "Terminator";
        /* llamando metodo muestraFichaTecnica */
        otraPelicula.muestraFichaTecnica();
    }
}
