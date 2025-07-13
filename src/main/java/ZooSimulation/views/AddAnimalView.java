package ZooSimulation.views;

import ZooSimulation.models.*;

import java.util.List;
import java.util.Scanner;

public class AddAnimalView {
    public static Animal print(List<Person> people) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Add a New Animal ===");

        System.out.println("Choose animal to add:");
        System.out.println("1. Parrot");
        System.out.println("2. Falcon");
        System.out.println("3. Owl");
        System.out.println("4. Rhino");
        System.out.println("5. Hippo");
        System.out.println("6. Elephant");
        System.out.println("7. Tiger");
        System.out.println("8. Lion");
        System.out.println("9. Cheetah");
        System.out.print("Enter option (1-9): ");
        String option = sc.nextLine().trim();

        System.out.print("Enter animal name: ");
        String name = sc.nextLine().trim();

        Animal animal = switch (option) {
            case "1" -> new Parrot(name);
            case "2" -> new Falcon(name);
            case "3" -> new Owl(name);
            case "4" -> new Rhino(name);
            case "5" -> new Hippo(name);
            case "6" -> new Elephant(name);
            case "7" -> new Tiger(name);
            case "8" -> new Lion(name);
            case "9" -> new Cheetah(name);
            default -> null;
        };

        if (animal == null) {
            System.out.println("Invalid option. Animal not created.");
            return null;
        }

        System.out.print("Enter handler's name to assign this animal: ");
        String handlerName = sc.nextLine().trim();
        Handler handler = findHandlerByName(people, handlerName);
        System.out.println("handla: " + handler.getName());

        if (handler == null) {
            System.out.println("Handler not found. Animal not assigned.");
        } else {
            handler.assignAnimal(animal);
            System.out.println(animal.getName() + " assigned to handler " + handler.getName());
        }

        return animal;
    }
    private static Handler findHandlerByName(List<Person> people, String handlerName) {
        return people.stream()
                .filter(p -> p instanceof Handler && p.getName().equalsIgnoreCase(handlerName))
                .map(p -> (Handler) p)
                .findFirst()
                .orElse(null);
    }
}
