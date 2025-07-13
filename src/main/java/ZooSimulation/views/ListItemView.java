package ZooSimulation.views;

import ZooSimulation.models.Shop;
import ZooSimulation.models.Vendor;

import java.util.Scanner;


public class ListItemView {
    public static void print(Shop shop){
//        Shop assignedShop =  vendor.getAssignedShop();

        if (shop.getShopProducts().isEmpty()) {
            System.out.println("Item list is empty!");

        } else {
            System.out.println("Current list of items:");
            shop.listItems();
        }
    }
}
