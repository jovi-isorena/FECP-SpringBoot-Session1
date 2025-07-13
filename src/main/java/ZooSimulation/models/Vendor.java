package ZooSimulation.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Vendor extends Person {

    public Vendor(String name) {
        super(name);
    }

    private Shop assignedShop;

    public Shop getAssignedShop() {
        return assignedShop;
    }

    public void setAssignedShop(Shop assignedShop) {
        this.assignedShop = assignedShop;
    }

}

//create a Product class
//inside product class: product name, price (use hashmap)

//Attribute for shop or ticket
//use super() class











