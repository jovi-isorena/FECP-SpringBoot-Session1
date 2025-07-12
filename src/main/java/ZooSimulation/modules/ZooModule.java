package ZooSimulation.modules;

import ZooSimulation.models.*;
import ZooSimulation.views.FeedAnimalView;
import ZooSimulation.views.ZooEnclosuresMenuView;
import ZooSimulation.views.ZooModuleMainMenuView;

import java.util.ArrayList;
import java.util.List;

public class ZooModule {
    private Zoo zoo;
    private Visitor visitor;
    public ZooModule(Zoo zoo, Visitor visitor) {
        this.zoo = zoo;
    }

    public Zoo start(){
        String selection = "";

        do{
            selection = ZooModuleMainMenuView.print();
            if(selection.equals("1")){
                visitEnclosure();
            }else if(selection.equals("2")){

            }else if(selection.equals("3")){

            }else if(selection.equals("4")){

            }else{
                System.out.println(ErrorMessage.INVALID_INPUT);
            }

        }while(!selection.equals("4"));


        return this.zoo;
    }

    public void visitEnclosure(){
        Enclosure<?> selectedEnclosure = ZooEnclosuresMenuView.print(zoo);
        // TODO: change the feeding session by group
        List<Animal> hungryAnimals = new ArrayList<>(selectedEnclosure.getAnimals().stream().filter(Animal::isHungry).toList());
        for (Animal hungryAnimal : hungryAnimals){
            FeedAnimalView.print(hungryAnimal);
        }
    }
}
