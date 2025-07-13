package ZooSimulation.views;

import ZooSimulation.models.Animal;

import java.util.List;

public class VisitorSickAnimalView {
    public static void print(List<Animal> sickedAnimals){
        System.out.println("Sick Animals Currently in Hospital");
        for (Animal animal: sickedAnimals) {
            System.out.printf("- %s\n", animal.getName());
        }
        System.out.println(" ");
    }
}
