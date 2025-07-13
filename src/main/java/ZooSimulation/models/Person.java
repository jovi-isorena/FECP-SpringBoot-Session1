package ZooSimulation.models;

public class Person {
    private String name;
    private int age;
    private String location;
    private Ticket ticket;
    private Role role;

    public Person(String name) {
        this.name = name;
    }

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
        this.location = destination;
    }
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

