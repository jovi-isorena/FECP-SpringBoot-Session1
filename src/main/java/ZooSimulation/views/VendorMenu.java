package ZooSimulation.views;

import ZooSimulation.models.Vendor;

import java.util.Scanner;

public class VendorMenu {
    public static Integer print(){
        Scanner scanner = new Scanner(System.in);
        int choice;

            System.out.println("=== Welcome Vendor! ===");
            System.out.println("1. List Items");
            System.out.println("2. Add Items");
            System.out.println("3. Remove Items");
            System.out.println("4. Exit");
            System.out.print("Choose Option (1-4): ");
            choice = scanner.nextInt();


            return choice;
    }
}
