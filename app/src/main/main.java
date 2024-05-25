package app.src.main;

import java.util.Scanner;

import app.src.models.Products;
import app.src.models.Target;

public class main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el límite de la tarjeta: ");
        double limit = lectura.nextDouble();
        Target tarjeta = new Target(limit);

        int salir = 1;
        while (salir != 0) {
            System.out.println("Escriba la descripción de la compra:");
            String descripcion = lectura.next();

            System.out.println("Escriba el valor de la compra:");
            double valor = Double.valueOf(lectura.next());

            Products compra = new Products(descripcion, valor);
            boolean compraRealizada = tarjeta.realizeShop(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = lectura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                salir = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        for (Products compra : tarjeta.getListOfShops()) {
            System.out.println(compra.getName() + " - " + compra.getCost());
        }
        System.out.println("\n***********************");
        System.out.println("\nSaldo de la tarjeta: " + tarjeta.getSaldo());
    }
}
