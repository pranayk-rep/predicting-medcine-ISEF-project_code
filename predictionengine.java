import project.MedicationRandomForest;
import project.MedicationRandomForest;
import java.util.List;

public class Predictionengine {

    private MedicationRandomForest model;
    private List<Medication> medications;

    public PredictionEngine(String csvPath) {
        medications = CSVLoader.load(csvPath);

        model = new MedicationRandomForest();
        model.train(medications);
    }

    public Medication predict(double weight, int age, String condition) {
        int prediction = model.predict(weight, age, condition,gender,daignoess);
        return medications.get(prediction);
    }

