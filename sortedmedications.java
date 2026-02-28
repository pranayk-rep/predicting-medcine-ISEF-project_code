import java.util.jar.Attributes.Name;
import project.MedicationRandomForest;

public class sortmedications {
    Name
    Amlodipine
    Amoxxilan 
    ibupriofen 

    String name;
    double dosage;

    public void Medication(String name, dosage) {
      this.name= name;
      this.dosage = dosage;
    }
   public String getName() {return name;}
   public double getDosage() {return dosage;}
   
   for (medication m : meds){
       System.out.println(m.getName()+ "-"+ m.getDosage());
   } 
}
