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
        zoo.setManager(new Manager("admin","admin","password"));

//        Tiger tigerDemo = new Tiger("tiger");
//        Tiger tigerDemo2 = new Tiger("tigga");
//        Owl owlDemo = new Owl("Ovo");
//        Handler joshuaHandler = new Handler("joshua", 23);
//        joshuaHandler.assignAnimal(tigerDemo);
//        joshuaHandler.assignAnimal(tigerDemo2);
//        joshuaHandler.assignAnimal(owlDemo);
//        zoo.getPeople().add(joshuaHandler);

//        List<Person> people = populatePeople();
//        do{
//            AdminModule adminModule = new AdminModule(zoo);
//            zoo = adminModule.start();
//        }while(!zoo.isOpen() || !zoo.isFinishedSetup());


//        TicketingModule ticketingModule = new TicketingModule(zoo);
//        zoo = ticketingModule.start();

//        TicketingModule ticketingModule = new TicketingModule(zoo);
//        zoo = ticketingModule.start();

        AdminModule adminModule = new AdminModule(zoo);
        do{
            zoo = adminModule.start();
            //if(zoo.isForcedClose()) return;
        }while(zoo.isFinishedSetup() && zoo.isOpen());

        TicketingModule ticketingModule = new TicketingModule(zoo);
        zoo = ticketingModule.start();

        // for zoo module


    }
}

