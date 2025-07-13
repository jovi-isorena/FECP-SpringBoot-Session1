package ZooSimulation.views;

import ZooSimulation.models.ErrorMessage;
import ZooSimulation.models.Manager;

import java.util.Scanner;

public class AdminLoginView  {
    private static Manager manager;

    public static Manager print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Welcome to the Zoo Admin Console ===");
        System.out.println("Please log in");

        System.out.print("Enter username: ");
        manager.setUserName(sc.nextLine());

        System.out.print("Enter password: ");
        manager.setPassword(sc.nextLine());

        if(manager.getUserName().equals("")){
            System.out.println(ErrorMessage.MISSING_INPUT);
        }
        return manager;
    }
}