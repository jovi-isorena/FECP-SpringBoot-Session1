package ZooSimulation.models;

import java.util.ArrayList;
import java.util.List;

public class Handler extends Person {
    private List<Animal> assignedAnimals;

    public Enclosure getHandlingEnclosure() {
        return handlingEnclosure;
    }

    public void setHandlingEnclosure(Enclosure handlingEnclosure) {
        this.handlingEnclosure = handlingEnclosure;
    }

    public void setAssignedAnimals(List<Animal> assignedAnimals) {
        this.assignedAnimals = assignedAnimals;
    }

    private Enclosure handlingEnclosure;

    public Handler(String name){
        super(name,Role.HANDLER);
        this.assignedAnimals = new ArrayList<>();
    }

    public Handler(String name, int age) {
        super(name, age, Role.HANDLER);
        this.assignedAnimals = new ArrayList<>();
    }

    public List<Animal> getAssignedAnimals() {
//        return assignedAnimals;
        return handlingEnclosure.getAnimals();
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
