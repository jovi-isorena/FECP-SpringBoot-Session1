package ZooSimulation.models;

abstract public class Feline extends Animal {
    private String location;

    public Feline(String name) {
        super(name); // passes name to Animal
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void roam() {
    }
}
