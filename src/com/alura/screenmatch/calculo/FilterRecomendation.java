package src.com.alura.screenmatch.calculo;

public class FilterRecomendation {
    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("Muy bien evaluado en el momento");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Agregalo a ver mas tarde");
        }
    }
}
