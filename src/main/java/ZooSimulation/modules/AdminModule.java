package ZooSimulation.modules;

import ZooSimulation.models.Animal;
import ZooSimulation.models.Manager;
import ZooSimulation.models.Zoo;
import ZooSimulation.views.AdminLoginView;
import ZooSimulation.views.ManagerMainMenu;

public class AdminModule {
    private Zoo zoo;


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

    public void addAnimal(){
//        Animal animal = AddAnimalView.print();
//        zoo.getAnimals().add(animal);
    }

    public Zoo getZoo() {
        return zoo;
    }

    public boolean isManagerValid(Manager manager){
        return manager.getUserName().equals(zoo.getManager().getUserName()) &&
                manager.getPassword().equals(zoo.getManager().getPassword());
    }
}
