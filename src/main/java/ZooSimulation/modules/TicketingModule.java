package ZooSimulation.modules;

import ZooSimulation.models.Person;
import ZooSimulation.models.Ticket;
import ZooSimulation.models.Visitor;
import ZooSimulation.models.Zoo;
import ZooSimulation.views.TicketValidationView;
import ZooSimulation.views.TicketingMainMenu;
import ZooSimulation.views.VisitorRegistrationView;

import java.util.Scanner;

public class TicketingModule {
    private Zoo zoo;
    private Visitor validatedVisitor;
    public TicketingModule(Zoo zoo){
        this.zoo = zoo;
    }

    public Zoo start(){
        while(true){
            boolean isUserBuying = TicketingMainMenu.print();
            if (isUserBuying) {
                purchaseTicket();
            } else {
                validatedVisitor = TicketValidationView.validate((zoo.getPeople()));
                if (validatedVisitor == null) break;
                else validatedVisitor.goTo("zoo");
            }
        }
        return zoo;
    }

    public void purchaseTicket(){
        Scanner sc = new Scanner(System.in);

        Visitor newVisitor = VisitorRegistrationView.register();

        System.out.print("Proceed with purchase (yes/no) ");
        String confirmation = sc.nextLine().toLowerCase().trim();

        boolean proceedingWithPurchase = confirmation.equals("yes");

        if (proceedingWithPurchase){
            Ticket ticket = generateTicket(newVisitor.getAge());
            newVisitor.setTicket(ticket);
            System.out.println(ticket.toString());

            zoo.getTickets().add(ticket);
            zoo.getPeople().add(newVisitor);
        }
    }

    public Ticket generateTicket(int age) {
        String ticketType;
        double price;

        if (age >= 0 && age <= 5) {
            ticketType = "Child";
            price = 0.00;
        } else if (age >= 6 && age <= 17) {
            ticketType = "Student";
            price = 75.00;
        } else if (age >= 18 && age <= 59) {
            ticketType = "Adult";
            price = 150.00;
        } else if (age >= 60) {
            ticketType = "Senior";
            price = 50.00;
        } else {
            ticketType = "Invalid Age";
            price = 0.00;
        }
        return new Ticket(price, ticketType, generateTicketId());
    }

    public String generateTicketId() {
        int ticketNumber = zoo.getTickets().isEmpty() ? 1 : zoo.getTickets().size() + 1;
        return String.format("ZOO-%04d", ticketNumber); // ZOO-001, ZOO-045, etc.
    }

    public Zoo getZoo() {
        return zoo;
    }

    public Visitor validatedVisitor(){
        return this.validatedVisitor;
    }
}
