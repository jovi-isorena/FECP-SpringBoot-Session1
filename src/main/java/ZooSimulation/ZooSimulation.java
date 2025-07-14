package ZooSimulation;

import ZooSimulation.models.*;
import ZooSimulation.modules.AdminModule;
import ZooSimulation.modules.TicketingModule;
import ZooSimulation.modules.ZooModule;
import ZooSimulation.views.WelcomeView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZooSimulation {
    public static void main(String[] args) {
        // entry point

        WelcomeView.print();
        Zoo zoo = new Zoo();
        zoo.setAnimals(new ArrayList<Animal>());
        zoo.setBuildings(Arrays.asList(
                new Building("Hospital"),
//                new Building("Ticket Shop"),
//                new Building("Gift Shop"),
//                new Building("Food Shop"),
//                new Building("Drink Shop"),
                new Building("Pachyderm Enclosure"),
                new Building("Bird Enclosure"),
                new Building("Feline Enclosure")
        ));

        zoo.setTickets(new ArrayList<Ticket>());
        zoo.setPeople(new ArrayList<Person>());
        zoo.setManager(new Manager("admin","admin","password"));

        AdminModule adminModule = new AdminModule(zoo);
        do{
            zoo = adminModule.start();
            if(zoo == null || zoo.isForceClosed()) return;
        }while(zoo.isFinishedSetup() && zoo.isOpen());

        TicketingModule ticketingModule = new TicketingModule(zoo);
        zoo = ticketingModule.start();
        Visitor visitor = ticketingModule.getValidatedVisitor();
        // for zoo module
        ZooModule zooModule = new ZooModule(zoo, visitor);
        zooModule.start();

    }
}

