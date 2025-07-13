package ZooSimulation.modules;

import ZooSimulation.models.*;
import ZooSimulation.views.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
                visitShop();
            }else if(selection.equals("3")){

            }else if(selection.equals("4")){

            }else{
                System.out.println(ErrorMessage.INVALID_INPUT);
            }

        }while(!selection.equals("4"));


        return this.zoo;
    }

    public void visitEnclosure(){
        visitor.setLocation("Enclosures");
        Enclosure<?> selectedEnclosure = ZooEnclosuresMenuView.print(zoo);
        visitor.setLocation(selectedEnclosure.getName());
        // TODO: change the feeding session by group
        List<Animal> hungryAnimals = new ArrayList<>(selectedEnclosure.getAnimals().stream().filter(Animal::isHungry).toList());
        for (Animal hungryAnimal : hungryAnimals){
            FeedAnimalView.print(hungryAnimal);
        }
    }

    public void visitShop(){
        visitor.setLocation("Shops");
        while(true){
            Shop selectedShop = VisitorShopSelectionMenuView.print(zoo);
            visitor.setLocation(selectedShop.getName());
            Map<String, Double> selectedProducts = VisitorDisplayShopItemsView.print(selectedShop);
            if(selectedProducts==null || selectedProducts.isEmpty()){
                continue;
            }
            boolean checkout = VisitorCheckoutPromptView.print(selectedProducts);
            if(!checkout){
                VisitorNotCheckoutView.print();
            }else{
                VisitorReceiptView.print(selectedProducts);
            }
            return;
        }
    }
}
