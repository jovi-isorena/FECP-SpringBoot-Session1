package ZooSimulation.models;

public class Visitor extends Person{

    public Visitor(String name, int age) {
        super(name, age);
    }

    public Visitor(String name, int age, Ticket ticket) {
        super(name, age, ticket);
    }
}
