package ZooSimulation.models;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Building{
    private List<String> products = new ArrayList<>();

    public List<String> getShopProducts() {
        return products;
    }


    private String shopType;

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public void listItems(){
        for(String product: products){
            System.out.println(product);
        }

    }

    public void addItems(String productName){
        products.add(productName);

    }

    public void removeItems(String productName){
        products.remove(productName);
    }

}

