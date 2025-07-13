package ZooSimulation.views;

import ZooSimulation.models.ErrorMessage;

import java.util.Scanner;

public class VisitorHospitalMainMenuView {
    public static String print(){
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(true){
            System.out.println("=== Zoo Visitor Hospital Monitor ===");
            System.out.println("1. View Sick Animals");
            System.out.println("2. View Healed Animals");
            System.out.println("3. Attend Science Lecture");
            System.out.println("4. Heal Animals (Veterinarian)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            input = sc.nextLine();
            if(!input.equalsIgnoreCase("1") &&
                    !input.equalsIgnoreCase("2") &&
                    !input.equalsIgnoreCase("3") &&
                    !input.equalsIgnoreCase("4") &&
                    !input.equalsIgnoreCase("5")){
                System.out.println(ErrorMessage.INVALID_INPUT);
            }else{
                break;
            }
        }
        sc.close();
        return input;
    }
}
