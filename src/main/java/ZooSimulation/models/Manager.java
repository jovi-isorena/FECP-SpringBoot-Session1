package ZooSimulation.models;

public class Manager extends Person {
    private String userName;
    private String password;

    public Manager(String name){
        super(name, Role.MANAGER);
    }

    public Manager(String name, int age){
        super(name, age, Role.MANAGER);
    }

    public Manager(String name, String userName, String password) {
        super(name,Role.MANAGER); // required
        this.userName = userName;
        this.password = password;
    }

    public Manager(String name, int age, String userName, String password) {
        super(name, age, Role.MANAGER); // required
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void openZoo(){

    }
    public void closeZoo(){

    }

}
