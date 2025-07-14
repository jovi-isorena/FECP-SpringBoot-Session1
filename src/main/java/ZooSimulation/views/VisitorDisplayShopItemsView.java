package ZooSimulation.views;

import ZooSimulation.models.ErrorMessage;
import ZooSimulation.models.Shop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VisitorDisplayShopItemsView {
    public static Map<String,Double> print(Shop shop){
        Scanner sc = new Scanner(System.in);
        System.out.printf("=== %s ===\n",shop.getShopType());
        Map.Entry<String,Double>[] products = getProductEntries(shop);
        Map<String,Double> selectedProducts = null;
        // if shop is empty, do nothing
        if(products.length == 0){
            System.out.println(ErrorMessage.EMPTY_SHOP);
            return null;
        }
        // ask for product selection
        System.out.println("Available Products");
        int counter = 0;
        for (Map.Entry<String,Double> entry: products){
            System.out.printf("%d. %s - P%.2f\n",++counter,entry.getKey(),entry.getValue());
        }
        int selectedIndex = -1;
        boolean checkout = false;

        while(selectedIndex == -1){
            selectedProducts = new HashMap<>();
            System.out.print("Enter the numbers of the items you want to buy (separated by \",\"): ");
            String[] selections = extractSelection(sc);
            for (String index: selections){
                try{
                    selectedIndex = Integer.parseInt(index) -1;
                    if (selectedIndex < 0){
                        System.out.println(ErrorMessage.NEGATIVE_NUMBER);
                        selectedIndex = -1;
                        break;
                    }
                    selectedProducts.put(products[selectedIndex].getKey(), products[selectedIndex].getValue());
                } catch (NumberFormatException e) {
                    System.out.println(ErrorMessage.NON_NUMERIC);
                    selectedIndex = -1;
                    break;
                }
            }
        }
        return selectedProducts;






    }

    private static String[] extractSelection(Scanner sc) {
        return sc.nextLine().split(",");
    }

    private static Map.Entry[] getProductEntries(Shop shop) {
        return shop.getShopProducts().entrySet().toArray(new Map.Entry[0]);
    }
}
