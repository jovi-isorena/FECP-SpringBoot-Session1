package ZooSimulation.models;

public class Person {
    private String name;
    private String location;

    public Person(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void goTo(String destination){

    }
}

