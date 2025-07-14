package ZooSimulation.views;

import ZooSimulation.models.*;

import java.util.Scanner;

public class ZooSetupMainMenu {

    public static void setup(Zoo zoo) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Zoo Setup ===");

        // Manager setup
        System.out.print("Enter your name (Manager): ");
        String managerName = sc.nextLine();
        zoo.setManager(new Manager(managerName));

        // Veterinarian setup
        System.out.print("Enter Veterinarian's name: ");
        String vetName = sc.nextLine();
        zoo.getPeople().add(new Veterinarian(vetName));

        // Handler setup
        Handler pachydermHandler = new Handler(prompt(sc, "Enter Handler's name for Pachyderm Enclosure: "));
        zoo.getPeople().add(pachydermHandler);
        Enclosure<?> pachydermEnclosure = zoo.getEnclosure("Pachyderm Enclosure");
        pachydermEnclosure.setAssignedHandler(pachydermHandler);
        pachydermHandler.setHandlingEnclosure(pachydermEnclosure);
        Handler felineHandler = new Handler(prompt(sc, "Enter Handler's name for Feline Enclosure: "));
        zoo.getPeople().add(felineHandler);
        Enclosure<?> felineEnclosure = zoo.getEnclosure("Feline Enclosure");
        felineEnclosure.setAssignedHandler(felineHandler);
        felineHandler.setHandlingEnclosure(felineEnclosure);
        Handler birdHandler = new Handler(prompt(sc, "Enter Handler's name for Bird Enclosure: "));
        zoo.getPeople().add(birdHandler);
        Enclosure<?> birdEnclosure = zoo.getEnclosure("Bird Enclosure");
        birdEnclosure.setAssignedHandler(birdHandler);
        birdHandler.setHandlingEnclosure(birdEnclosure);

        // Vendor setup
        //Ticket Shop
        String ticketVendorName = prompt(sc, "Enter Vendor for Ticket Shop: ");
        Vendor ticketVendor = new Vendor(ticketVendorName);
        Shop ticketShop = new TicketShop(ticketVendor);
        ticketVendor.setAssignedShop(ticketShop);
        zoo.getPeople().add(ticketVendor);
        zoo.getBuildings().add(ticketShop);
        System.out.println("✅ " + ticketVendorName + " assigned to Ticket Shop.");

        //Food Shop
        String foodVendorName = prompt(sc, "Enter Vendor for Food Shop: ");
        Vendor foodVendor = new Vendor(foodVendorName);
        Shop foodShop = new FoodShop(foodVendor);
        foodVendor.setAssignedShop(foodShop);
        zoo.getPeople().add(foodVendor);
        zoo.getBuildings().add(foodShop);
        System.out.println("✅ " + foodVendorName + " assigned to Food Shop.");

        //Gift Shop
        String giftVendorName = prompt(sc, "Enter Vendor for Gift Shop: ");
        Vendor giftVendor = new Vendor(giftVendorName);
        Shop giftShop = new GiftShop(giftVendor);
        giftVendor.setAssignedShop(giftShop);
        zoo.getPeople().add(giftVendor);
        zoo.getBuildings().add(giftShop);
        System.out.println("✅ " + giftVendorName + " assigned to Gift Shop.");

        //Drink Shop
        String drinkVendorName = prompt(sc, "Enter Vendor for Drink Shop: ");
        Vendor drinkVendor = new Vendor(drinkVendorName);
        Shop drinkShop = new DrinkShop(drinkVendor);
        drinkVendor.setAssignedShop(drinkShop);
        zoo.getPeople().add(drinkVendor);
        zoo.getBuildings().add(drinkShop);
        System.out.println("✅ " + drinkVendorName + " assigned to Drink Shop.");

        System.out.println("\nZoo setup complete!\n");
        zoo.finishSetup();
    }

    private static String prompt(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
