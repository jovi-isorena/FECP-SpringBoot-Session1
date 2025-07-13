package ZooSimulation.models;

abstract public class Bird extends Animal{
    private String location;

    public Bird(String name) {
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

    public void roam() {

    }
}
