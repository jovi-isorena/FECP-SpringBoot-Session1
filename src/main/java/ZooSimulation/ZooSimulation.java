package ZooSimulation;

import ZooSimulation.models.*;
import ZooSimulation.modules.AdminModule;

import java.util.ArrayList;

public class ZooSimulation {
    public static void main(String[] args) {
        // entry point
        Zoo zoo = new Zoo();
        zoo.setPeople(new ArrayList<Person>());
        zoo.setAnimals(new ArrayList<Animal>());
        zoo.setBuildings(new ArrayList<Building>());
//        do{
//            AdminModule adminModule = new AdminModule(zoo);
//            zoo = adminModule.start();
//        }while(!zoo.isOpen() || !zoo.isFinishedSetup());

//        TicketingModule ticketingModule = new TicketingModule(zoo);
//        zoo = ticketingModule.start();


    }
}

