package app.src.models;

public class Products implements Comparable<Products> {
    private String name;
    private double cost;

    public Products(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Compra{" + "valor" + cost + ", descripcion=" + name + "}";
    }

    /* ordernar por valor */
    @Override
    public int compareTo(Products otheProducts) {
        return Double.valueOf(this.cost).compareTo(Double.valueOf(otheProducts.getCost()));
    }
}
