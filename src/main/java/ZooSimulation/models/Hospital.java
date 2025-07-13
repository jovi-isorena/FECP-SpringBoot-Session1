package ZooSimulation.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hospital extends Building{
    // TODO: create a list of records: admittance & healed;
    private List<HospitalRecord> hospitalRecords;

    public Hospital(){
        this.hospitalRecords = new ArrayList<>();
    }

    public List<HospitalRecord> getRecords(){
        return new ArrayList<>(hospitalRecords);
    }

    public void AddRecord(Animal animal, String action, LocalDateTime datetime){
        hospitalRecords.add(new HospitalRecord(animal, action, datetime));
    }
}

