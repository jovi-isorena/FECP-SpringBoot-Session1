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
                visitHospital();
            }else if(selection.equals("4")){
                VisitorLeaveZooView.print();
                return zoo;
            }else{
                System.out.println(ErrorMessage.INVALID_INPUT);
            }
        }while(true);
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

    public void visitHospital(){
        visitor.goTo("Hospital");
        while(true){
            String hospitalSelection = VisitorHospitalMainMenuView.print();
            if(hospitalSelection.equals("1")){
                viewSickAnimals();
            }else if(hospitalSelection.equals("2")){
                viewHealedAnimals();
            }else if (hospitalSelection.equals("3")) {
                attendScienceLecture();
            }else if (hospitalSelection.equals("4")) {
                healAnimals();
            }else if (hospitalSelection.equals("5")){
                return;
            }
        }

    }

    private void healAnimals() {
        Veterinarian vet = zoo.getVet();
        Hospital hospital = zoo.getHospital();
        List<Animal> sickedAnimals = getSickedAnimals();
        VisitorHealAnimalView.print(vet, sickedAnimals, zoo);
    }

    private void attendScienceLecture() {
        Veterinarian vet = zoo.getVet();
        VisitorAttendLectureView.print(vet);
    }

    private void viewHealedAnimals() {
        Hospital hospital = zoo.getHospital();
        if(hospital==null) {
            System.out.println(ErrorMessage.HOSPITAL_NOT_FOUND);
            return;
        }
        VisitorHealedAnimalView.print(hospital);
    }



    private void viewSickAnimals() {
        List<Animal> sickedAnimals = getSickedAnimals();
        VisitorSickAnimalView.print(sickedAnimals);
    }

    private List<Animal> getSickedAnimals() {
        return zoo.getAnimals().stream().filter(a -> !a.isHealthy() && a.getLocation().equals("Hospital")).toList();
    }
}
