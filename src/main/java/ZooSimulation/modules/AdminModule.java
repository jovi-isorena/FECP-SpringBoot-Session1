package ZooSimulation.modules;

import ZooSimulation.models.Animal;
import ZooSimulation.models.Handler;
import ZooSimulation.models.Manager;
import ZooSimulation.models.Zoo;
import ZooSimulation.views.*;

// todo vet timestamp and
// enclosure types,
// add animal, animal factory,
// people factory

public class AdminModule {
    private Zoo zoo;

    public AdminModule(Zoo zoo){
        this.zoo = zoo;
    }

    public Zoo start(){
        // Initial setup
        if (!zoo.isFinishedSetup()) ZooSetupMainMenu.setup(zoo);

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
                    handlerModule();
                    break;
                }
                case "3": { // Open zoo to visitor shop
                    System.out.println("Opened the zoo for visitors!");
                    zoo.openTheZoo();
                    break;
                }
                case "4": { // Close zoo to visitors
                    System.out.println("Closed the zoo for visitors!");
                    zoo.closeTheZoo();
                    break;
                }
                case "5": { // Exit
                    System.out.println("Exiting... Thank you!");
                    return zoo;
                }
                default: {
                    System.out.println("Invalid option");
                }
            }
        }
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

    public Zoo getZoo() {
        return zoo;
    }
}