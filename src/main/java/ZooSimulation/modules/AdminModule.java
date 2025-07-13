package ZooSimulation.modules;

import ZooSimulation.models.*;
import ZooSimulation.views.*;


import java.util.Scanner;

public class AdminModule {
    private Zoo zoo;
    Scanner scanner = new Scanner(System.in);

    //    Manager zooManager = new Manager("user1","password1");
    public AdminModule(Zoo zoo){
        this.zoo = zoo;
    }

    public Zoo start() {
        Manager manager = AdminLoginView.print();
        boolean valid = isManagerValid(manager);
        if (valid) {
            ManagerMainMenu.print();

        }
        return zoo;
    }

//        call mo nalang to pag need ilabas yung vendor management and yung vendor item menu

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
        scanner.close();
        System.out.println("Exiting vendor menu... Thank you!");
    }




//    public void addAnimal(){
//        Animal animal = AddAnimalView.print();
//        zoo.getAnimals().add(animal);
//    }

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
