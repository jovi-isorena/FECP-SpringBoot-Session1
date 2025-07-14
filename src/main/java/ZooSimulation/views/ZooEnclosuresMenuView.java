package ZooSimulation.views;

import ZooSimulation.models.*;

import java.util.List;
import java.util.Scanner;

public class ZooEnclosuresMenuView {
    public static Building print(Zoo zoo){
//        Enclosure<?> pachydermEnclosures = zoo.getBuildings().stream().filter(b -> b instanceof Enclosure ).toList();
        // TODO: filter the buildings
        Building pachydermEnclosure = zoo.getBuildings().stream().filter(b-> b.getName() != null && b.getName().equals("Pachyderm Enclosure")).findFirst().orElse(null);
        Building felineEnclosure = zoo.getBuildings().stream().filter(b->b.getName() != null && b.getName().equals("Feline Enclosure")).findFirst().orElse(null);
        Building birdEnclosure = zoo.getBuildings().stream().filter(b->b.getName() != null && b.getName().equals("Bird Enclosure")).findFirst().orElse(null);
        Scanner sc = new Scanner(System.in);
        String input = "";
        Building selectedEnclosure = null;
        do{
            System.out.println("=== Zoo Enclosure ===");
            System.out.println("Choose Enclosure");
            System.out.println("1. Pachyderm (Elephant, Rhino, Hippo)");
            System.out.println("2. Feline (Tiger, Lion, Cheetah)");
            System.out.println("3. Bird (Owl, Falcon, Parrot)");
            System.out.print("Choose an option: ");

            input = sc.nextLine();
            if (input.equals("1")){
                selectedEnclosure = pachydermEnclosure;
            }else if(input.equals("2")){
                selectedEnclosure = felineEnclosure;
            }else if(input.equals("3")){
                selectedEnclosure = birdEnclosure;
            }else{
                System.out.println(ErrorMessage.INVALID_INPUT);
            }
        }while(selectedEnclosure == null);

//        sc.close();
        return selectedEnclosure;
    }
}
