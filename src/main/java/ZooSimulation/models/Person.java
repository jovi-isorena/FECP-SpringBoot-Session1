package ZooSimulation.models;

public class Person {
    private String name;
    private int age;
    private String location;
    private Ticket ticket;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Ticket ticket) {
        this.name = name;
        this.age = age;
        this.ticket = ticket;
    }

    public int getAge() {
        return age;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
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

