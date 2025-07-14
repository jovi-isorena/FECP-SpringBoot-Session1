package ZooSimulation.models;

import java.time.LocalDateTime;

public class Veterinarian extends Person {
    public Veterinarian(String name) {
        super(name,Role.VETERINARIAN);
    }
    public void lecture(){
        System.out.printf("%s gives a science lecture on animal health and conservation.\n", getName());
    }
    public void heal(Animal animal, Zoo zoo){
        Hospital hospital = zoo.getHospital();
        animal.setHealthy(true);
        animal.setLocation("Enclosure");
        hospital.AddRecord(animal, "healed", LocalDateTime.now());
    }

}
