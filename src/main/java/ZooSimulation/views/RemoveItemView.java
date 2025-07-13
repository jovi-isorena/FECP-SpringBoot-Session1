package ZooSimulation.views;

import ZooSimulation.models.Shop;
import ZooSimulation.models.Vendor;

import java.util.Scanner;

public class RemoveItemView {
    public static void print(Vendor vendor) {
        Scanner scanner = new Scanner(System.in);
        Shop assignedShop =  vendor.getAssignedShop();

        System.out.print("Enter item to be removed: ");
        String productName = scanner.nextLine().toUpperCase();

        if(assignedShop.getShopProducts().contains(productName)){
            assignedShop.removeItems(productName);
            System.out.println("Product removed!");
        } else {
            System.out.println("No products found!");
        }

        System.out.println("Press ENTER to return to the menu");
        scanner.nextLine();
        scanner.close();
    }
}
