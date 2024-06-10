package src.com.alura.screenmatch.modelos;

public class ErrorEnCobvecionDuracion extends RuntimeException {
    private String message;
    public ErrorEnCobvecionDuracion(String message){
        this.message = message;

    }

}
