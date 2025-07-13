package ZooSimulation.models;

import java.util.List;

public class Enclosure<T extends Animal> extends Building{
    private List<T> animals;

    public List<T> getAnimals() {
        return animals;
    }

    public void setAnimals(List<T> animals) {
        this.animals = animals;
    }





}
