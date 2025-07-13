package ZooSimulation.views;

import ZooSimulation.models.ErrorMessage;
import ZooSimulation.models.Vendor;

import java.util.Scanner;

public class VendorLoginForm {

    public static String print(Scanner scanner){
        System.out.print("Enter vendor name: ");
        String vendorName = scanner.nextLine();
        if (vendorName.isEmpty()){
            System.out.println(ErrorMessage.MISSING_INPUT);
        }
        return vendorName;
    }
}
