package ZooSimulation.views;

import ZooSimulation.models.Handler;
import ZooSimulation.models.Manager;
import ZooSimulation.models.Person;
import ZooSimulation.models.Zoo;

import java.util.Scanner;

public class ZooSetupMainMenu {
    public static void setup(Zoo zoo){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name (Manager): ");
        String managerName = sc.nextLine();

        System.out.print("Enter Veterinarian's name: ");
        String vetName = sc.nextLine();

        System.out.print("Enter Handler's name for Pachyderm Enclosure: ");
        String pachydermHandler = sc.nextLine();

        System.out.print("Enter Handler's name for Feline Enclosure: ");
        String felineHandler = sc.nextLine();

//        System.out.print("Enter Handler's name for Bird Enclosure: ");
//        zoo.getPeople().add(new Handler(sc.nextLine());
//
//        System.out.print("Enter your name (Manager): ");
//        String managerName = sc.nextLine();
//
//        System.out.print("Enter your name (Manager): ");
//        String managerName = sc.nextLine();

//
//        Manager manager = new Manager(managerName, managerAge);
//        zoo.getPeople().add(manager);
    }
}
