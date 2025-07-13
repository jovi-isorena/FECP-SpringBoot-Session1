package ZooSimulation;

import ZooSimulation.models.*;
import ZooSimulation.modules.AdminModule;
import ZooSimulation.modules.TicketingModule;
import ZooSimulation.views.WelcomeView;

import java.util.ArrayList;
import java.util.List;

public class ZooSimulation {
    public static void main(String[] args) {
        // entry point

        WelcomeView.print();
        Zoo zoo = new Zoo();
        zoo.setAnimals(new ArrayList<Animal>());
        zoo.setBuildings(new ArrayList<Building>());
        zoo.setTickets(new ArrayList<Ticket>());
        zoo.setPeople(new ArrayList<Person>());

//        List<Person> people = populatePeople();
//        do{
//            AdminModule adminModule = new AdminModule(zoo);
//            zoo = adminModule.start();
//        }while(!zoo.isOpen() || !zoo.isFinishedSetup());


        TicketingModule ticketingModule = new TicketingModule(zoo);
        zoo = ticketingModule.start();

//        TicketingModule ticketingModule = new TicketingModule(zoo);
//        zoo = ticketingModule.start();


    }
}

