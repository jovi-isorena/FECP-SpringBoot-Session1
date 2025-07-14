package ZooSimulation.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Vendor extends Person {
    private Shop assignedShop;

    public Vendor(String name) {
        super(name, Role.VENDOR);
    }

    public Vendor(String name, Shop assignedShop) {
        super(name, Role.VENDOR);
        this.assignedShop = assignedShop;
    }

    public Shop getAssignedShop() {
        return assignedShop;
    }

    public void setAssignedShop(Shop assignedShop) {
        this.assignedShop = assignedShop;
    }
    // TODO: implement sell() method in Vendor. Transfer logic from ZooModule View
    public void sell(){}


}
