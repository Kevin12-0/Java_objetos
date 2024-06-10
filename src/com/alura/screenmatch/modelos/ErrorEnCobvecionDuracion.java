package src.com.alura.screenmatch.modelos;

public class ErrorEnCobvecionDuracion extends RuntimeException {
    private String message;
    /* crear un mensaje de error propio */
    public ErrorEnCobvecionDuracion(String message) {
        this.message = message;

    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
