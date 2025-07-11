package ZooSimulation.models;

abstract public class Pachyderm extends Animal{
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void roam() {

    }

    abstract public void makeSound();
}
