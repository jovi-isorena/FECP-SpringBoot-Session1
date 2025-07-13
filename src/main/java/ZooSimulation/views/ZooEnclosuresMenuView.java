package ZooSimulation.views;

import ZooSimulation.models.*;

import java.util.List;
import java.util.Scanner;

public class ZooEnclosuresMenuView {
    public static Enclosure<?> print(Zoo zoo){
//        Enclosure<?> pachydermEnclosures = zoo.getBuildings().stream().filter(b -> b instanceof Enclosure ).toList();
        // TODO: filter the buildings
        Enclosure<Pachyderm> pachydermEnclosure = (Enclosure<Pachyderm>)zoo.getBuildings().stream().filter(b-> b.getName().equals("Pachyderm Enclosure")).findFirst().orElse(null);
        Enclosure<Feline> felineEnclosure = (Enclosure<Feline>)zoo.getBuildings().stream().filter(b->b.getName().equals("Feline Enclosure")).findFirst().orElse(null);
        Enclosure<Bird> birdEnclosure = (Enclosure<Bird>)zoo.getBuildings().stream().filter(b->b.getName().equals("Bird Enclosure")).findFirst().orElse(null);
        Scanner sc = new Scanner(System.in);
        String input = "";
        Enclosure<?> selectedEnclosure = null;
        do{
            System.out.println("=== Zoo Enclosure ===");
            System.out.println("Choose Enclosure");
            System.out.printf("1. Pachyderm ()\n");
            System.out.printf("2. Feline ()\n");
            System.out.printf("3. Bird ()\n");
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

        sc.close();
        return selectedEnclosure;
    }
}
