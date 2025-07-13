package ZooSimulation.views;

import ZooSimulation.models.*;

import java.util.Scanner;

public class ZooSetupMainMenu {

    public static void setup(Zoo zoo) {
        Scanner sc = new Scanner(System.in);

        if(!zoo.isFinishedSetup()) System.out.println("=== Initial zoo setup ===");

        // Manager setup
        System.out.print("Enter your name (Manager): ");
        String managerName = sc.nextLine();
        System.out.print("Enter username: ");
        String userName = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        zoo.setManager(new Manager(managerName, userName, password));

        // Veterinarian setup
        System.out.print("Enter Veterinarian's name: ");
        String vetName = sc.nextLine();
        zoo.getPeople().add(new Veterinarian(vetName));

        // Handler setup
        zoo.getPeople().add(new Handler(prompt(sc, "Enter Handler's name for Pachyderm Enclosure: ")));
        zoo.getPeople().add(new Handler(prompt(sc, "Enter Handler's name for Feline Enclosure: ")));
        zoo.getPeople().add(new Handler(prompt(sc, "Enter Handler's name for Bird Enclosure: ")));

        // Vendor setup
        zoo.getPeople().add(new Vendor(prompt(sc, "Enter Vendor for Ticket Shop: ")));
        zoo.getPeople().add(new Vendor(prompt(sc, "Enter Vendor for Gift Shop: ")));

        System.out.println("\nZoo setup complete!\n");
    }

    private static String prompt(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
