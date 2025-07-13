package ZooSimulation.views;

import java.util.Map;

public class VisitorReceiptView {
    public static void print(Map<String,Double> products){
        System.out.println("Payment successful!\nReceipt:");
        Double sum = 0.0;
        for (Map.Entry<String,Double> entry:products.entrySet()){
            System.out.printf("- %s: P%.2f\n",entry.getKey(),entry.getValue());
            sum += entry.getValue();
        }
        System.out.printf("\nTotal Paid: %.2f\n\n",sum);
    }
}
