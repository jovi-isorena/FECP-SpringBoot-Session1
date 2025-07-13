package ZooSimulation.modules;

import ZooSimulation.models.Animal;
import ZooSimulation.models.Manager;
import ZooSimulation.models.Zoo;
import ZooSimulation.views.AdminLoginView;
import ZooSimulation.views.ManagerMainMenu;
import java.util.Scanner;

public class AdminModule {
    private Zoo zoo;
    Scanner scanner = new Scanner(System.in);

    //    Manager zooManager = new Manager("user1","password1");
    public AdminModule(Zoo zoo){
        this.zoo = zoo;
    }

    public Zoo start(){
        Manager manager = AdminLoginView.print();
        boolean valid = isManagerValid(manager);
        if(valid){
            ManagerMainMenu.print();

        }
        return zoo;
    }

//        Used for shop assigning, vendor validation, and vendor name input

//        GiftShop giftShop = new GiftShop();
//        FoodShop foodShop = new FoodShop();
//        DrinksShop drinksShop = new DrinksShop();
//
        String vendorName = VendorLoginForm.print();
        Vendor validVendor = isVendorValid(vendorName);
//        Vendor assignVendor = Scanner.nextLine();
//        if (validVendor != null){
//            validVendor.getAssignedShop();
//            assignVendor.setAssignedShop();
//            return zoo;
//            }

        {
            int choice;
            VendorMenu.print();

            do {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        ListItemView.print(validVendor);
                        break;

                    case 2:
                        AddItemView.print(validVendor);
                        break;

                    case 3:
                        RemoveItemView.print(validVendor);
                        break;

                }
            }while (choice !=4);
            scanner.close();

            return zoo;
        }
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
