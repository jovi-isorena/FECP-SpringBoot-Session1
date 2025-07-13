package ZooSimulation.models;

public abstract class Animal {
    private boolean isHealthy;
    private String name;
    private boolean isHungry;

    public Animal() {
        // by default, animals are healthy but hungry
        isHungry = true;
        isHealthy = true;
    }

    public Animal(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }


    public void eat(){
        isHungry = false;
    }
    public boolean isHungry(){
        return isHungry;
    }
    public void sleep(){

    }
    abstract public void roam();
    abstract public void makeSound();
    abstract public String getLocation();
    abstract public void setLocation(String location);
}
