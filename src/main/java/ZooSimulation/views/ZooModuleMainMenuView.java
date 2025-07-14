package ZooSimulation.views;

import java.util.Scanner;

public class ZooModuleMainMenuView {
    public static String print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("1. Visit Enclosure");
        System.out.println("2. Visit Shop");
        System.out.println("3. Visit Hospital");
        System.out.println("4. Leave Zoo");
        System.out.print("Choose an option: ");
        String input = sc.nextLine();
//        sc.close();
        return input;
    }
}
