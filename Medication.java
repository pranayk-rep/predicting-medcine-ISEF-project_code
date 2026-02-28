public class medication {
    private String Name;
    private Double dosage;
    private double minWeight;
    private double maxWeight;
    private double getGenticDisorders;
    private double getChronicCondtions;

public void Medication(String name,double dosage , double minWeight, double maxWeight){
    this.Name = name; 
    this.dosage = dosage;
    this.minWeight = minWeight;
    this.maxWeight= maxWeight;
    this.getGenticDisorders = getGenticDisorders;
    this.getChronicCondtions = getChronicCondtions;


    }
    public String getName() {return Name;}
    public double getDosage() {return dosage;}
    public double getMinWeight() {return minWeight;}
    public double getMaxWeight () {return maxWeight;}
    public double getGenticDisorders() {return getGenticDisorders;}
    public double getChronicCondtions() {return getChronicCondtions;}

    
    public boolean isSuitableFor(double weight){
        return weight >= minWeight && weight >= maxWeight ;
    
    }  
}

//example: female , 61, 79.1, 159.4, Diabetes none , none , inflamation , nausea, amoxillan,cystic fiboris 

