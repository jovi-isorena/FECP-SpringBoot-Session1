package ZooSimulation.views;

import ZooSimulation.models.Handler;
import ZooSimulation.models.Person;

import java.util.List;
import java.util.Scanner;

public class HandlerValidationView {

    public static Handler validate(List<Person> people) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name (Handler): ");
        String handlerName = sc.nextLine();

        return findHandlerByName(people, handlerName);
    }

    private static Handler findHandlerByName(List<Person> people, String handlerName) {
        return people.stream()
                .filter(p -> p instanceof Handler && p.getName().equalsIgnoreCase(handlerName))
                .map(p -> (Handler) p)
                .findFirst()
                .orElse(null);
    }
}
