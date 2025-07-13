package ZooSimulation.models;

import java.util.ArrayList;
import java.util.List;

public class Handler extends Person {
    private List<Animal> assignedAnimals;
    private Enclosure handlingEnclosure;

    public Handler(String name){
        super(name);
        this.assignedAnimals = new ArrayList<>();
    }

    public Handler(String name, int age) {
        super(name, age);
        this.assignedAnimals = new ArrayList<>();
    }

    public List<Animal> getAssignedAnimals() {
        return assignedAnimals;
    }

    public void assignAnimal(Animal animal) {
        this.assignedAnimals.add(animal);
    }

    public void feed() {
        // behavior to feed animals
    }

    public void exercise() {
        // behavior to exercise animals
    }

    public void examine() {
        // behavior to examine animals
    }
}
