package ZooSimulation.views;

import ZooSimulation.models.ErrorMessage;
import ZooSimulation.models.Vendor;

import java.util.Scanner;

public class VendorLoginForm {

    public static String print(){
        System.out.print("Enter vendor name: ");
        Scanner sc = new Scanner(System.in);
        String vendorName = sc.nextLine();
        if (vendorName.isEmpty()){
            System.out.println(ErrorMessage.MISSING_INPUT);
        }
        return vendorName;
    }
}
