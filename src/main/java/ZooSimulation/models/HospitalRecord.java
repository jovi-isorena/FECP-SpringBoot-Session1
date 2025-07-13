package ZooSimulation.models;

import java.time.LocalDateTime;

public class HospitalRecord {
    final private Animal animal;
    final private String action;
    final private LocalDateTime timestamp;

    public HospitalRecord(Animal animal, String action, LocalDateTime timestamp) {
        this.animal = animal;
        this.action = action;
        this.timestamp = timestamp;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getAction() {
        return action;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Record{" + "animal=" + animal + ", action='" + action + '\'' + ", timestamp=" + timestamp + '}';
    }
}
