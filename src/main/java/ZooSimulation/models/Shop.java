package ZooSimulation.models;

import java.util.HashMap;

public class Shop extends Building{
    private HashMap<String, Double> products;

    public HashMap<String, Double> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, Double> products) {
        this.products = products;
    }



}
