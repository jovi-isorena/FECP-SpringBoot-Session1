package ZooSimulation.views;

import ZooSimulation.models.Hospital;
import ZooSimulation.models.HospitalRecord;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class VisitorHealedAnimalView {
    public static void print(Hospital hospital){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Healed Animals with Timestamps:");
        List<HospitalRecord> healingRecords = hospital.getRecords().stream().filter(r->r.getAction().equalsIgnoreCase("healed")).toList();
        for (HospitalRecord record: healingRecords){
            System.out.printf("- %s ✅(%s)\n",record.getAnimal().getName(),record.getTimestamp().format(formatter));
        }
        System.out.println(" ");
    }
}
