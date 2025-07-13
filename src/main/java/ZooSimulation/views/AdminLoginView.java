package ZooSimulation.views;

import ZooSimulation.models.ErrorMessage;
import ZooSimulation.models.Manager;
import ZooSimulation.models.Zoo;

import java.util.Scanner;

public class AdminLoginView  {
    private static Manager manager;

    public static Manager validate(Zoo zoo) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== ADMIN LOGIN ===");
        System.out.print("Enter username: ");
        String inputUsername = sc.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = sc.nextLine();

        Manager stored = zoo.getManager();

        if (stored != null &&
                stored.getUserName().equals(inputUsername) &&
                stored.getPassword().equals(inputPassword)) {
            return stored; // login successful
        } else {
            System.out.println("Invalid credentials.");
            return null;
        }
    }

}