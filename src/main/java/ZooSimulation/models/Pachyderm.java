package ZooSimulation.models;

abstract public class Pachyderm extends Animal{
    public Pachyderm(String name) {
        super(name); // passes name to Animal
    }

    private String location;
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
