package ZooSimulation.services;

import ZooSimulation.models.Animal;

import java.util.List;

public class AnimalService {
    private List<Animal> animals;

    public AnimalService(List<Animal> animals){
        this.animals = animals;
    }

    public void addAnimals(Animal animal){
        animals.add(animal);
    }

    public List<Animal> getAnimals(){
        return this.animals;
    }

}
