package src;

import java.util.ArrayList;

import src.com.alura.screenmatch.calculo.CalculatorOfTime;
import src.com.alura.screenmatch.calculo.FilterRecomendation;
import src.com.alura.screenmatch.modelos.Episodio;
import src.com.alura.screenmatch.modelos.Pelicula;
import src.com.alura.screenmatch.modelos.Serie;

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
        kobraKai.muestraFichaTecnica();
        System.out.println(kobraKai.getDurationInMinutes());

        CalculatorOfTime calculator = new CalculatorOfTime();
        calculator.incluides(miPelicula);
        calculator.incluides(kobraKai);
        System.out.println("tiempo total: " + calculator.getTotalTime());

        FilterRecomendation filterRecomendation = new FilterRecomendation();
        filterRecomendation.filter(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setName("Kobra Kai");
        episodio.setNumber(1);
        episodio.setSerie(kobraKai);
        episodio.setTotalViews(50);
        filterRecomendation.filter(episodio);

        /*
         * se puede cambiar Pelicula por var, al principio de declarar la variable
         * no significa que se puede cambiar el tipo de dato
         */

        var peliculaDeKevin = new Pelicula();
        peliculaDeKevin.setName("Señor de los anillos");
        peliculaDeKevin.setDuration(180);
        peliculaDeKevin.setData(2001);

        /* creando un array list */
        ArrayList<Pelicula> listaMovies = new ArrayList<>();
        /* agregar items al array list */
        listaMovies.add(peliculaDeKevin);
        listaMovies.add(miPelicula);
        listaMovies.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaMovies.size());
        /* obtenes un elemento en particular */
        System.out.println("La primera pelicula es: " + listaMovies.get(0).getNombre());
        /* imprime la lista pero me retorna el nombre del espacio en memoria */
        System.out.println(listaMovies);
        /* retorna el nombre de la clase y un caracter exadecimal */
        System.out.println(listaMovies.get(0).toString());
    }
}
