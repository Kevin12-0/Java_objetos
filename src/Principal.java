package src;

import src.com.alura.java.screenmatch.Pelicula;
import src.com.alura.java.screenmatch.Serie;

public class Principal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Pelicula => llamando a la clase
         * new Pelicula => espacio para el objeto
         */
        Pelicula miPelicula = new Pelicula();
        /* asignar valores a atributos de la clase */
        miPelicula.setName("Encanto");
        miPelicula.setData(2021);
        miPelicula.setDuration(115);
        /* llamando a un metodo */
        miPelicula.muestraFichaTecnica();
        /* llamando a metodo de evaluar pelicula */
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(9);
        miPelicula.evaluacion(8);
        miPelicula.evaluacion(8);
        /*
         * llamando metodo pra ver la informacion de
         * una varibale de tipo privado
         */
        System.out.println(miPelicula.getTotalEvaluaciones());
        /* llamando a metodo pára calcualr la media */
        System.out.println(miPelicula.calcularMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setData(1999);
        otraPelicula.setDuration(180);
        ;
        otraPelicula.setName("Terminator");
        /* llamando metodo muestraFichaTecnica */
        otraPelicula.muestraFichaTecnica();

        /* llamando a una clase serie */

        Serie kobraKai = new Serie();

        /* llamando a sus atributos para asignarle un valor */
        kobraKai.setName("Kobra Kai");
        kobraKai.setData(2017);
        kobraKai.setTemporades(5);
        kobraKai.setMinutesForEpisodi(50);
        kobraKai.setEpisodeForSeason(14);
        System.out.println(kobraKai.getDurationInMinutes());
    }
}
