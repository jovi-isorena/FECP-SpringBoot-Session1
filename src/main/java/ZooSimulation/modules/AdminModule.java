package ZooSimulation.modules;

import ZooSimulation.models.Manager;
import ZooSimulation.views.AdminLoginView;
import ZooSimulation.views.ManagerMainMenu;

public class AdminModule {
    Manager zooManager = new Manager("user1","password1");

    public void start(){
        Manager manager = AdminLoginView.print();
        boolean valid = isManagerValid(manager);
        if(valid){
            ManagerMainMenu.print();

        }

    }

    public boolean isManagerValid(Manager manager){
        if(manager.getUserName() == zooManager.getUserName() &&
        manager.getPassword() == zooManager.getPassword()){
            return true;
        }
        else{
            return false;
        }
    }
}
