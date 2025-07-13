package ZooSimulation.views;

import ZooSimulation.models.Animal;
import ZooSimulation.models.Handler;

import java.util.List;
import java.util.Scanner;

public class AnimalDutyMenu {
    public static Animal chooseAnimal(Handler handler) {
        System.out.println("\nWelcome, Handler " + handler.getName());
        List<Animal> assignedAnimals = handler.getAssignedAnimals();
        Scanner sc = new Scanner(System.in);

        if (assignedAnimals == null || assignedAnimals.isEmpty()) {
            System.out.println("No animals assigned.");
            return null;
        }

        while (true) {
            System.out.println("\n=== Animal Duty Menu ===");
            for (int i = 0; i < assignedAnimals.size(); i++) {
                Animal a = assignedAnimals.get(i);
                System.out.printf("%d. %s (%s)%n", i + 1, a.getName(), a.getClass().getSimpleName());
            }
            System.out.print("Choose animal number to interact with (0 to exit): ");

            String input = sc.nextLine();
            try {
                int choice = Integer.parseInt(input);

                if (choice == 0) return null;
                if (choice >= 1 && choice <= assignedAnimals.size()) {
                    return assignedAnimals.get(choice - 1); // Convert to 0-based index
                } else {
                    System.out.println("Invalid number. Please enter a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
