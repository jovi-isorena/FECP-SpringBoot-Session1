package ZooSimulation.models;

public class Ticket {
    private final double price;
    private final String ticketType;
    private final String id;

    public Ticket(double price, String ticketType, String id) {
        this.price = price;
        this.ticketType = ticketType;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public String getTicketType() {
        return ticketType;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id + ", Type: " + ticketType + ", Price: ₱" + String.format("%.2f", price);
    }
}
