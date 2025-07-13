package ZooSimulation.views;

import ZooSimulation.models.Shop;
import ZooSimulation.models.Vendor;

import java.util.Scanner;

public class AddItemView {

    public static void print(Vendor vendor){
        Scanner scanner = new Scanner(System.in);
        Shop assignedShop =  vendor.getAssignedShop();

        System.out.print("Enter item: ");
        String productName = scanner.nextLine().toUpperCase();
        String shopType = scanner.nextLine().toUpperCase();

        if (!productName.trim().isEmpty() && productName.matches("[a-zA-Z]+")) {
            System.out.print("Which shop does this item belong to?: ");
            assignedShop.setShopType(shopType);
            assignedShop.addItems(productName);
            System.out.println("Product added!");
        } else {
            System.out.println("Item label should not have any numbers! Try again");
        }

        System.out.println("Press ENTER to return to the menu");
        scanner.nextLine();
        scanner.close();
    }
}
