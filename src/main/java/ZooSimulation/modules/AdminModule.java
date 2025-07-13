package ZooSimulation.modules;

import ZooSimulation.models.Animal;
import ZooSimulation.models.Handler;
import ZooSimulation.models.Manager;
import ZooSimulation.models.Zoo;
import ZooSimulation.views.*;

public class AdminModule {
    private Zoo zoo;


    //    Manager zooManager = new Manager("user1","password1");
    public AdminModule(Zoo zoo){
        this.zoo = zoo;
    }

    public Zoo start(){
//        Manager manager = AdminLoginView.print();
//        boolean valid = isManagerValid(manager);
//        if(valid){
//            ManagerMainMenu.print();
//
//        }
        handlerModule();
        return zoo;
    }

    public void addAnimal(){
//        Animal animal = AddAnimalView.print();
//        zoo.getAnimals().add(animal);
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

    public boolean isHandlerValid(Handler handler){
        return true;
    }

    public boolean isManagerValid(Manager manager){
        return manager.getUserName().equals(zoo.getManager().getUserName()) &&
                manager.getPassword().equals(zoo.getManager().getPassword());
    }

    public Zoo getZoo() {
        return zoo;
    }
}
