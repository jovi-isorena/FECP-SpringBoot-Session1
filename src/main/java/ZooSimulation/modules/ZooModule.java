package ZooSimulation.modules;

import ZooSimulation.models.ErrorMessage;
import ZooSimulation.models.Visitor;
import ZooSimulation.models.Zoo;
import ZooSimulation.views.ZooModuleMainMenuView;

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

    }
}
