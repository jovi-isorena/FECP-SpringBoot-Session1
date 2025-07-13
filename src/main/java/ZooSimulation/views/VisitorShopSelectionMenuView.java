package ZooSimulation.views;

import ZooSimulation.models.*;

import java.util.Scanner;

public class VisitorShopSelectionMenuView {
    public static Shop print(Zoo zoo){
//        Shop drinksShop = (Shop)zoo.getBuildings().stream().filter(b-> b.getName().equals("Drink Shop")).findFirst().orElse(null);
//        Shop foodShop = (Shop)zoo.getBuildings().stream().filter(b->b.getName().equals("Food Shop")).findFirst().orElse(null);
//        Shop giftShop = (Shop)zoo.getBuildings().stream().filter(b->b.getName().equals("Gift Shop")).findFirst().orElse(null);
        Scanner sc = new Scanner(System.in);
        String input = "";
        Shop selectedShop = null;
        do{
            System.out.println("=== Zoo Shops ===");
            System.out.println("Choose Shop:");
            System.out.println("1. Drinks Shop");
            System.out.println("2. Food Shop");
            System.out.println("3. Gift Shop");
            System.out.print("Choose an option: ");
            input = sc.nextLine();
            if(input.equals("1")){
                selectedShop = (Shop)zoo.getBuildings().stream().filter(b-> b.getName().equals("Drink Shop")).findFirst().orElse(null);
            } else if (input.equals("2")) {
                selectedShop = (Shop)zoo.getBuildings().stream().filter(b->b.getName().equals("Food Shop")).findFirst().orElse(null);
            } else if (input.equals("3")) {
                selectedShop = (Shop)zoo.getBuildings().stream().filter(b->b.getName().equals("Gift Shop")).findFirst().orElse(null);
            }else{
                System.out.println(ErrorMessage.INVALID_INPUT);
            }
        }while(selectedShop == null);
        sc.close();
        return selectedShop;
    }
}
