package ZooSimulation.models;

public abstract class Animal {
    private boolean isHealthy;
    private String name;

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

    }
    public void sleep(){

    }
    abstract public void roam();
}
