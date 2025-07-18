package ZooSimulation.views;

import ZooSimulation.models.*;

import java.util.Scanner;

public class ZooSetupMainMenu {

    public static void setup(Zoo zoo) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Zoo Setup ===");

        // Manager setup
        System.out.print("Enter your name/username (Manager): ");
        String managerName = sc.nextLine();
        zoo.getManager().setUserName(managerName);
        zoo.getManager().setUserName(managerName);

        // Veterinarian setup
        System.out.print("Enter Veterinarian's name: ");
        String vetName = sc.nextLine();
        zoo.getPeople().add(new Veterinarian(vetName));

        // Handler setup
        zoo.getPeople().add(new Handler(prompt(sc, "Enter Handler's name for Pachyderm Enclosure: ")));
        zoo.getPeople().add(new Handler(prompt(sc, "Enter Handler's name for Feline Enclosure: ")));
        zoo.getPeople().add(new Handler(prompt(sc, "Enter Handler's name for Bird Enclosure: ")));

        // Vendor setup
        //Ticket Shop
        String ticketVendorName = prompt(sc, "Enter Vendor for Ticket Shop: ");
        Vendor ticketVendor = new Vendor(ticketVendorName);
        Shop ticketShop = new TicketShop(ticketVendor);
        ticketVendor.setAssignedShop(ticketShop);
        zoo.getPeople().add(ticketVendor);
        zoo.getBuildings().add(ticketShop);

        //Food Shop
        String foodVendorName = prompt(sc, "Enter Vendor for Food Shop: ");
        Vendor foodVendor = new Vendor(foodVendorName);
        Shop foodShop = new FoodShop(foodVendor);
        foodVendor.setAssignedShop(foodShop);
        zoo.getPeople().add(foodVendor);
        zoo.getBuildings().add(foodShop);

        //Gift Shop
        String giftVendorName = prompt(sc, "Enter Vendor for Gift Shop: ");
        Vendor giftVendor = new Vendor(giftVendorName);
        Shop giftShop = new GiftShop(giftVendor);
        giftVendor.setAssignedShop(giftShop);
        zoo.getPeople().add(giftVendor);
        zoo.getBuildings().add(giftShop);

        //Drink Shop
        String drinkVendorName = prompt(sc, "Enter Vendor for Drink Shop: ");
        Vendor drinkVendor = new Vendor(drinkVendorName);
        Shop drinkShop = new DrinkShop(drinkVendor);
        drinkVendor.setAssignedShop(drinkShop);
        zoo.getPeople().add(drinkVendor);
        zoo.getBuildings().add(drinkShop);

        System.out.println("\nZoo setup complete!\n");
        zoo.finishSetup();
    }

    private static String prompt(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
