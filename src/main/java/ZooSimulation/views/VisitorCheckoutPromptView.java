package ZooSimulation.views;

import java.util.Map;
import java.util.Scanner;

public class VisitorCheckoutPromptView {
    public static boolean print(Map<String,Double> products){
        Scanner sc = new Scanner(System.in);
        Double sum = 0.0;
        System.out.println("Selected:");
        for (Map.Entry<String,Double> entry: products.entrySet()){
            System.out.printf("%s (P%.2f)\n",entry.getKey(), entry.getValue());
            sum += entry.getValue();
        }
        System.out.printf("\nTotal: %.2f\n",sum);
        String input = "";
        do{
            System.out.println("\nProceed to checkout? (y/n)");
            input = sc.nextLine();
        }while(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));

        sc.close();
        return input.equalsIgnoreCase("y");
    }
}
