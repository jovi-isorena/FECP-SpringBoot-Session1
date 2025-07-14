package ZooSimulation.views;

import ZooSimulation.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
//                selectedShop = (Shop)zoo.getBuildings().stream().filter(b-> b.getName() != null && b instanceof Shop && ((Shop)b).getShopType().equals("Drink") ).findFirst().orElse(null);
                selectedShop = getShop("Drink", zoo.getBuildings());
            } else if (input.equals("2")) {
//                selectedShop = (Shop)zoo.getBuildings().stream().filter(b->b.getName() != null && b instanceof Shop && ((Shop)b).getShopType().equals("Food") ).findFirst().orElse(null);
                selectedShop = getShop("Food", zoo.getBuildings());
            } else if (input.equals("3")) {
//                selectedShop = (Shop)zoo.getBuildings().stream().filter(b->b.getName() != null && b instanceof Shop && ((Shop)b).getShopType().equals("Gift") ).findFirst().orElse(null);
                selectedShop = getShop("Gift", zoo.getBuildings());
            }else{
                System.out.println(ErrorMessage.INVALID_INPUT);
            }
        }while(selectedShop == null);
        //sc.close();
        return selectedShop;
    }

    private static Shop getShop(String shopType, List<Building> buildings){
        Shop shops = buildings.stream()
                // 1. Filter out non-Shop objects.
                //    'instanceof' checks if the object is a Shop or a subclass of Shop.
                .filter(building -> building instanceof Shop)
                // 2. Cast the filtered Building objects to Shop.
                //    This cast is now safe because we've already checked with instanceof.
                //    If using Java 16+, you can use pattern matching for instanceof for cleaner code.
                .map(building -> (Shop) building) // Cast to Shop
                // 3. Filter by the specific shopType.
                //    Objects.equals() is used for null-safe string comparison.
                //    Or use .equals() if you are sure shopType will never be null.
                .filter(shop -> Objects.equals(shop.getShopType(), shopType))
                // Collect the results into a List of Shop objects
//                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
                .findFirst().orElse(null);
        // The above is equivalent to .collect(Collectors.toList()); in most cases
        return shops;
    }
}
