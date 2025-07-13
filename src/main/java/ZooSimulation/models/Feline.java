package ZooSimulation.models;

abstract public class Feline extends Animal{
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
