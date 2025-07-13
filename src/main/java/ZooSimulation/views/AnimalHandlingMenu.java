package ZooSimulation.views;

import ZooSimulation.models.Animal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AnimalHandlingMenu {

    public static void handle(Animal animal) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Animal Handling Menu ---");
        actionMenu(animal.getName());
        System.out.print("Choose an action: ");

        String choice = sc.nextLine().trim();

        switch (choice) {
            case "1": // Feed
                animal.eat();
                System.out.println(animal.getName() + " has been fed.");
                break;
            case "2": // Exercise
                animal.roam();
                System.out.println(animal.getName() + " has exercised.");
                break;
            case "3": // Examine
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");

                System.out.println( "Sending " + animal.getName() + " to the vet.");
                System.out.println(animal.getName() + " admitted at: " + now.format(formatter));

                animal.setLocation("vet");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void actionMenu(String animalName) {
        System.out.println("1. Feed " + animalName);
        System.out.println("2. Exercise " + animalName);
        System.out.println("3. Examine " + animalName + " to Vet");
    }
}
