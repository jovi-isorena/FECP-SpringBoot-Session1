package ZooSimulation.views;

import ZooSimulation.models.Person;
import ZooSimulation.models.Ticket;
import ZooSimulation.models.Visitor;

import java.util.List;
import java.util.Scanner;

public class TicketValidationView {
    public static Visitor validate(List<Person> people) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Already have a ticket? Enter ticket code: ");
        String ticketId = sc.nextLine().trim();

        for (Person person : people) {
            Ticket ticket = person.getTicket();
            if (ticket != null && ticket.getId().equalsIgnoreCase(ticketId)) {
                if (person instanceof Visitor) {
                    System.out.println("Welcome, " + person.getName() + "! Your ticket is valid.");
                    return (Visitor) person;
                } else {
                    System.out.println("Ticket is valid but not owned by a visitor.");
                    return null;
                }
            }
        }

        System.out.println("Ticket not found or invalid.");
        return null;
    }
}
