package ZooSimulation.views;

import ZooSimulation.models.Shop;
import ZooSimulation.models.Vendor;

import java.util.Scanner;

public class RemoveItemView {
    public static void print(Shop shop, Scanner scanner) {
//        Shop assignedShop =  vendor.getAssignedShop();

        System.out.print("Enter item to be removed: ");
        String productName = scanner.nextLine().toUpperCase();

        if(shop.getShopProducts().containsKey(productName)){
            shop.removeItems(productName);
            System.out.println(productName + " has been removed!");
        } else {
            System.out.println("No products found!");
        }

        System.out.println("Press ENTER to return to the menu");
        scanner.nextLine();
        scanner.close();
    }
}
