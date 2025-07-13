package ZooSimulation.views;

import java.util.Scanner;

public class AdminMainMenu {
    public static String chooseOption(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Zoo Admin Main Menu ===");
        System.out.println("1. Setup Zoo Staff");
        System.out.println("2. Access Handler Module");
        System.out.println("3. Open Zoo to Visitors");
        System.out.println("4. Close Zoo to Visitors");
        System.out.println("5. Exit");

        System.out.print("Choose an option: ");

        return sc.nextLine().trim();
    }
}
