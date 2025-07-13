package ZooSimulation.views;

import ZooSimulation.models.Animal;
import ZooSimulation.models.Hospital;
import ZooSimulation.models.Veterinarian;
import ZooSimulation.models.Zoo;

import java.util.List;

public class VisitorHealAnimalView {
    public static void print(Veterinarian vet, List<Animal> sickedAnimals, Zoo zoo){
        System.out.printf("%s begins healing sick animals..\n",vet.getName());
        for(Animal animal: sickedAnimals){
            vet.heal(animal,zoo);
            System.out.printf("✅ Healed: %s\n", animal.getName());
            System.out.printf("%s has been discharged and returned to enclosure.\n", animal.getName());
        }
        System.out.println(" ");
    }
}
