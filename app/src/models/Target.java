package app.src.models;

import java.util.ArrayList;
import java.util.List;

public class Target {
    /* variables */
    private double limit;
    private double saldo;
    private List<Products> listOfShops;

    /* metodo constructor */
    public Target(double limit) {
        this.limit = limit;
        this.saldo = limit;
        this.listOfShops = new ArrayList<>();
    }

    /* verificar el saldo */
    public boolean realizeShop(Products products) {
        if (this.saldo >= products.getCost()) {
            this.saldo -= products.getCost();
            this.listOfShops.add(products);
            return true;
        }
        return false;
    }
    /* asignar el limite */

    public double getLimit() {
        return limit;
    }
    /* retornar la lista de prodcutos */
    public List<Products> getListOfShops() {
        return listOfShops;
    }
    /* obtener el saldo */
    public double getSaldo() {
        return saldo;
    }

}
