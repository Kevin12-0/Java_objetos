package src;

public class Principal {
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
        System.out.println("Mi pelicula es: " + miPelicula.nombre + " y su fecha de lanzamiento es: "
                + miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.duracionEnMinutos = 218;
        otraPelicula.fechaDeLanzamiento = 1999;
        otraPelicula.nombre = "Terminator";
        System.out.println("Mi pelicula es: " + otraPelicula.nombre + " y su fecha de lanzamiento es: "
                + otraPelicula.fechaDeLanzamiento);

    }
}
