package ZooSimulation.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Vendor extends Person {
    public Vendor(String name, int age) {
        super(name, age);
    }

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
    // TODO: implement sell() method in Vendor. Transfer logic from ZooModule View
    public void sell(){}


}
