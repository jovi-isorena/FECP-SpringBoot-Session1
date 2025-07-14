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
        Zoo zoo = zooBuilder();

        AdminModule adminModule = new AdminModule(zoo);
        do{
            zoo = adminModule.start();
            if(zoo == null || zoo.isForceClosed()) return;
        }while(!zoo.isFinishedSetup() || !zoo.isOpen());

        TicketingModule ticketingModule = new TicketingModule(zoo);
        zoo = ticketingModule.start();

        // for zoo module
        Visitor visitor = ticketingModule.validatedVisitor();

        ZooModule zooModule = new ZooModule(zoo, visitor);
        zooModule.start();

    }

    private static Zoo zooBuilder(){
        Zoo zoo = new Zoo();
        zoo.setAnimals(new ArrayList<Animal>());
        zoo.setBuildings(new ArrayList<Building>());
//         todo: add enclosures, hospital
        Enclosure<Pachyderm> enc1 = new Enclosure<>("Pachyderm Enclosure");
        Enclosure<Bird> enc2 = new Enclosure<>("Bird Enclosure");
        Enclosure<Feline> enc3 = new Enclosure<>("Feline Enclosure");
        zoo.getBuildings().add(new Hospital());

        zoo.getBuildings().addAll(Arrays.asList(enc1, enc2, enc3));

        zoo.setTickets(new ArrayList<Ticket>());
        zoo.setPeople(new ArrayList<Person>());
        zoo.setManager(new Manager("admin","admin","password"));
//        Zoo zoo = new Zoo();
//        zoo.setAnimals(new ArrayList<Animal>());
//        zoo.setBuildings(new ArrayList<Building>());
//        zoo.setTickets(new ArrayList<Ticket>());
//        zoo.setPeople(new ArrayList<Person>());
//        zoo.setManager(new Manager("admin","admin","password"));
//        Handler handler1 = new Handler("pac");
//        Handler handler2 = new Handler("bir");
//        Handler handler3 = new Handler("fel");
//        zoo.getPeople().addAll(Arrays.asList(handler1, handler2, handler3));
//        Vendor ticketVendor = new Vendor("tic");
//        // tic
//        Shop ticketShop = new TicketShop(ticketVendor);
//        ticketVendor.setAssignedShop(ticketShop);
//        zoo.getPeople().add(ticketVendor);
//        zoo.getBuildings().add(ticketShop);
//        // foo
//        Vendor foodVendor = new Vendor("foo");
//        Shop foodShop = new FoodShop(foodVendor);
//        foodVendor.setAssignedShop(foodShop);
//        zoo.getPeople().add(foodVendor);
//        zoo.getBuildings().add(foodShop);
//        // gif
//        Vendor giftVendor = new Vendor("gif");
//        Shop giftShop = new GiftShop(giftVendor);
//        giftVendor.setAssignedShop(giftShop);
//        zoo.getPeople().add(giftVendor);
//        zoo.getBuildings().add(giftShop);
//        // dri
//        Vendor drinkVendor = new Vendor("dri");
//        Shop drinkShop = new DrinkShop(drinkVendor);
//        drinkVendor.setAssignedShop(drinkShop);
//        zoo.getPeople().add(drinkVendor);
//        zoo.getBuildings().add(drinkShop);
//        //
//        Veterinarian vet = new Veterinarian("vet");
//        zoo.getPeople().add(vet);
//        // animals
//        Parrot par1 = new Parrot("par1");
//        Parrot par2 = new Parrot("par2");
//        Parrot par3 = new Parrot("par3");
//        handler2.assignAnimal(par1);
//        handler2.assignAnimal(par2);
//        handler2.assignAnimal(par3);
//        zoo.getAnimals().addAll(Arrays.asList(par1,par2,par3));
//        //
//        Enclosure<Pachyderm> enc1 = new Enclosure<>("Pachyderm Enclosure");
//
//        Enclosure<Bird> enc2 = new Enclosure<>("Bird Enclosure");
//        enc2.setAnimals(Arrays.asList(par1,par2,par3));
//        Enclosure<Feline> enc3 = new Enclosure<>("Feline Enclosure");
//        zoo.getBuildings().addAll(Arrays.asList(enc1, enc2, enc3));
//
//        zoo.getBuildings().add(new Hospital());
//        par1.setLocation("Hospital");
//        par1.setHealthy(false);
//        par2.setLocation("Hospital");
//        par2.setHealthy(false);
//        //
//        drinkShop.addItems("coke",50D);
//        drinkShop.addItems("royal",33D);
//        zoo.openTheZoo();

        return zoo;
    }
}

