package ZooSimulation.views;

import ZooSimulation.models.Shop;
import ZooSimulation.models.Vendor;

import java.util.Scanner;


public class ListItemView {
    public static void print(Vendor vendor){
        Scanner scanner = new Scanner(System.in);
        Shop assignedShop =  vendor.getAssignedShop();

        if (assignedShop.getShopProducts().isEmpty()) {
            System.out.println("Item list is empty!");
            System.out.println("Press Enter to go back to the Vendor Menu");
            scanner.nextLine();

        } else {
            System.out.println("Current list of items:");
            System.out.println("Press Enter to go back to the Vendor Menu");
            assignedShop.listItems();
        }

        System.out.println("Press ENTER to return to the menu");
        scanner.nextLine();
        scanner.close();
    }
}
