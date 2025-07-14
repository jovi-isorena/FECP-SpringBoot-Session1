package ZooSimulation.modules;

import ZooSimulation.models.*;
import ZooSimulation.views.*;
import java.util.Scanner;

/*
     drink and all the shops (done)
     set animal for handler (done)
     add animal (done)
     remove admin module loop (done)
     force close zoo (done)

     TODO enclosure types
     TODO add animal, animal factory,
     TODO person factory
     TODO vet timestamp
     TODO error handling (error enums)
*/

public class AdminModule {
    private Zoo zoo;
    Scanner scanner = new Scanner(System.in);

    public AdminModule(Zoo zoo){
        this.zoo = zoo;
    }

    public Zoo start(){
        // Admin log-in
        Manager manager = null;
        while (manager == null){
            manager = AdminLoginView.validate(zoo);
        }

        while(true){
            String option = AdminMainMenu.chooseOption();
            switch (option){
                case "1": { // Setup zoo staff
                    ZooSetupMainMenu.setup(zoo);
                    break;
                }
                case "2": { // Access Handler module
                    addAnimal();
                    break;
                }
                case "3": { // Access Vendor module
                    handlerModule();
                    break;
                }
                case "4": { // Add animal
                    vendorManagement();
                    break;
                }
                case "5": { // Open zoo to visitors
                    System.out.println("Opened the zoo for visitors!");
                    zoo.openTheZoo();
                    break;
                }
                case "6": { // Close zoo to visitors
                    System.out.println("Closing the zoo...");
                    zoo.closeTheZoo();
                    zoo.forceCloseZoo();
                    return null;
                }
                case "7": { // Exit
                    boolean setupNotDone = !zoo.isFinishedSetup() && !zoo.isForceClosed();
                    boolean zooClosed = !zoo.isOpen() && !zoo.isForceClosed();

                    if (setupNotDone) System.out.println("Zoo setup is not finished");
                    if (zooClosed) System.out.println("Zoo is still closed");
                    if (!setupNotDone && !zooClosed) System.out.println("Exiting... Thank you!");

                    return zoo;
                }
                default: {
                    System.out.println("Invalid option");
                }
            }
        }
    }

    private void vendorManagement() {
        System.out.println("\n--- Vendor Login ---");
        String vendorName = VendorLoginForm.print(scanner);
        Vendor validVendor = isVendorValid(vendorName);

        if (validVendor != null) {
            Shop assignedShop = validVendor.getAssignedShop();
            if (assignedShop == null) {
                System.out.println("Error: This vendor is not assigned to any shop.");
                return;
            }
            System.out.println("Welcome " + validVendor.getName() + "! Managing the " + assignedShop.getShopType() + " shop.");
            vendorItemMenu(assignedShop);
        } else {
            System.out.println("❌ Vendor not found.");
        }
    }

    private void vendorItemMenu (Shop assignedShop){
        int choice;
        do {
            choice = VendorMenu.print(scanner);
            switch (choice) {
                case 1:
                    ListItemView.print(assignedShop);
                    break;

                case 2:
                    AddItemView.print(assignedShop, scanner);
                    break;

                case 3:
                    RemoveItemView.print(assignedShop, scanner);
                    break;
            }
        } while (choice != 4);
        System.out.println("Exiting vendor menu... Thank you!");
    }

    public void addAnimal(){
        Animal animal = AddAnimalView.print(zoo.getPeople());
        if (animal == null) return;
        zoo.getAnimals().add(animal);
    }

    public void handlerModule() {
        Handler handler = HandlerValidationView.validate(zoo.getPeople());
        if (handler == null) return;

        while (true) {
            Animal chosenAnimal = AnimalDutyMenu.chooseAnimal(handler);
            if (chosenAnimal == null) {
                System.out.println("Finished duties for today.");
                return; // Exit only when user chooses 0
            }

            AnimalHandlingMenu.handle(chosenAnimal);
        }
    }

    public Zoo getZoo() {
        return zoo;
    }

    public boolean isManagerValid(Manager manager){
        return manager.getUserName().equals(zoo.getManager().getUserName()) &&
                manager.getPassword().equals(zoo.getManager().getPassword());
    }


    public Vendor isVendorValid(String vendorName){
        return (Vendor)zoo.getPeople()
                .stream()
                .filter(p -> p.getName().equals(vendorName))
                .findFirst()
                .orElse(null);
    }
}