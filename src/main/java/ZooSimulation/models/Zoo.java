package ZooSimulation.models;

import java.util.List;

public class Zoo {
    private List<Person> people;
    private List<Building> buildings;
    private List<Animal> animals;
    private boolean isOpen;
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    private Manager manager;
    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public void openTheZoo(){
        this.isOpen = true;
    }
    public void closeTheZoo(){
        this.isOpen = false;
    }
    public boolean isOpen(){
        return this.isOpen;
    }

    public boolean isFinishedSetup() {
        return this.people.size() < 10;
    }

    public Veterinarian getVet() {
        return (Veterinarian) people.stream().filter(p->p.getRole() == Role.VETERINARIAN).findFirst().orElse(null);
    }
    public Hospital getHospital() {
        return (Hospital) this.getBuildings().stream().filter(b -> b.getName().equalsIgnoreCase("Hospital")).findFirst().orElse(null);
    }
}
