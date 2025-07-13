package ZooSimulation.views;

import ZooSimulation.models.Shop;
import ZooSimulation.models.Vendor;

import java.util.Scanner;

public class AddItemView {

    public static void print(Shop shop, Scanner scanner){
//        Shop assignedShop =  vendor.getAssignedShop();

        System.out.print("Enter item: ");
        String productName = scanner.nextLine().toUpperCase();
//        String shopType = scanner.nextLine().toUpperCase();
        System.out.print("Enter price: ");
        Double price = scanner.nextDouble();
        scanner.nextLine();

        if (!productName.trim().isEmpty() && productName.matches("[a-zA-Z]+")) {
//            System.out.print("Which shop does this item belong to? (Gift/Food/Drinks): ");
//            assignedShop.setShopType(shopType);
            shop.addItems(productName,price);
            System.out.println("✅ " + productName + " has been added to the shop!");
        } else {
            System.out.println("Item label should not have any numbers! Try again");
        }

        System.out.println("Press ENTER to return to the menu");
        scanner.nextLine();
    }
}
