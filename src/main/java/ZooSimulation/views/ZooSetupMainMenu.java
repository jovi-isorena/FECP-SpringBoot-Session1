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
        zoo.getPeople().add(new Handler(prompt(sc, "Enter Handler's name for Pachyderm Enclosure: ")));
//        zoo.getPeople().add(new Handler(prompt(sc, "Enter Handler's name for Feline Enclosure: ")));
//        zoo.getPeople().add(new Handler(prompt(sc, "Enter Handler's name for Bird Enclosure: ")));

        // Vendor setup
//        zoo.getPeople().add(new Vendor(prompt(sc, "Enter Vendor for Ticket Shop: "), new TicketShop("Ticket")));
//        zoo.getPeople().add(new Vendor(prompt(sc, "Enter Vendor for Gift Shop: "), new GiftShop("Gift")));
//        zoo.getPeople().add(new Vendor(prompt(sc, "Enter Vendor for Food Shop: "), new FoodShop("Food")));
//        zoo.getPeople().add(new Vendor(prompt(sc, "Enter Vendor for Drink Shop: "), new DrinkShop("Drink")));

        System.out.println("\nZoo setup complete!\n");
        zoo.finishSetup();
    }

    private static String prompt(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
