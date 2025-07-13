package ZooSimulation.models;

import java.util.HashMap;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Building{
    private Vendor assignedVendor;


    public Shop(Vendor vendor) {
        this.assignedVendor = vendor;
    }

    public Vendor getAssignedVendor() {
        return assignedVendor;
    }

    public void setAssignedVendor(Vendor vendor) {
        this.assignedVendor = vendor;
    }

    private HashMap<String, Double> products = new HashMap<>();

    public HashMap<String, Double> getShopProducts() {
        return products;
    }

    public void setProducts(HashMap<String, Double> products) {
        this.products = products;
    }

    private String shopType;

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public void listItems(){
        for(String productKey: products.keySet()){
            System.out.println(productKey + " - " + products.get(productKey));
        }
    }

    public void addItems(String productName,Double price){
       products.put(productName,price);

    }

    public void removeItems(String productName){
        products.remove(productName);
    }

}

