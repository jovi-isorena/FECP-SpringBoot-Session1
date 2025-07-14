package ZooSimulation.models;

import java.util.List;

public class Zoo {
    private List<Person> people;
    private List<Building> buildings;
    private List<Animal> animals;
    private List<Ticket> tickets;
    private Manager manager;
    private boolean isOpen;
    private boolean isForceClosed;
    private  boolean isFinishedSetup;

    public Manager getManager() {
        return manager;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

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

    public void finishSetup(){
        this.isFinishedSetup = true;
    }

    public void openTheZoo(){
        this.isOpen = true;
    }
    public void closeTheZoo(){
        this.isOpen = false;
    }
    public void forceCloseZoo(){
        this.isForceClosed = true;
    }

    public boolean isOpen(){
        return this.isOpen;
    }
    public boolean isForceClosed(){
        return this.isForceClosed;
    }
    public boolean isFinishedSetup() {
        return this.isFinishedSetup;
    }

    public Veterinarian getVet() {
        return (Veterinarian) people.stream().filter(p->p.getRole() == Role.VETERINARIAN).findFirst().orElse(null);
    }
    public Hospital getHospital() {
        return (Hospital) this.getBuildings().stream().filter(b -> b.getName() != null && b.getName().equalsIgnoreCase("Hospital")).findFirst().orElse(null);
    }
}
