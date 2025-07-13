package ZooSimulation.views;

import ZooSimulation.models.Animal;
import ZooSimulation.models.ErrorMessage;

import java.util.Scanner;

public class FeedAnimalView {
    public static void print(Animal animal){
        Scanner sc = new Scanner(System.in);
        String input = "";
        do {
            System.out.printf("Would you like to feed %s? (y/n)", animal.getName());
            input = sc.nextLine();
            if(input.equalsIgnoreCase("y")){
                animal.eat();
                System.out.printf("%s is eating.\n", animal.getName());
                animal.makeSound();
            }else if(input.equalsIgnoreCase("n")){
                break;
            }else{
                System.out.println(ErrorMessage.INVALID_INPUT);
            }
        }while(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));
    }
}