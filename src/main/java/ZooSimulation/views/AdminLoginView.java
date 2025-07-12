package ZooSimulation.views;

import ZooSimulation.models.ErrorMessage;
import ZooSimulation.models.Manager;

import java.util.Scanner;

public class AdminLoginView  {
    private static Manager manager;

    public static Manager print(){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        manager.setUserName(sc.nextLine());
        if(manager.getUserName().equals("")){
            System.out.println(ErrorMessage.MISSING_INPUT);
        }
        return manager;
    }
}
