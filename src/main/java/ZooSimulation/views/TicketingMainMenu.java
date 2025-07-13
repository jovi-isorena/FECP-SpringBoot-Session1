package ZooSimulation.views;

import java.util.Scanner;

    public class TicketingMainMenu {

        public static boolean print() {
            System.out.println("\n=== WELCOME TO THE ZOO TICKET SHOP ===");
            System.out.println("Here's what you can experience in the zoo:");
            System.out.println("- Visit Animal Enclosures (Elephant, Lion, Owl)");
            System.out.println("- Buy snacks and drinks from our Shops");
            System.out.println("- Listen to science lectures at the Hospital");
            System.out.println("- Buy fun gifts at our Gift Shop");

            Scanner sc = new Scanner(System.in);
            System.out.print("Would you like to buy a ticket? (yes/no): ");
            String choice = sc.nextLine().toLowerCase();

            // Don't close the Scanner if System.in is still needed elsewhere

            return choice.equals("yes");
        }
    }