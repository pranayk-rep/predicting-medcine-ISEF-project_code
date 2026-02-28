import weka.core.Instances;
import weka.core.converters.CSVLoader;
import weka.core.converters.ArffSaver;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.trees.RandomForest;
import weka.classifiers.Evaluation;

import java.io.File;

public class PersonalizedMedication {

    public static void main(String[] args) throws Exception {

        // Load CSV
        CSVLoader loader = new CSVLoader();
        loader.setSource(new File("Personalized_Medication.csv"));
        Instances dataset = loader.getDataSet();

        // Save as ARFF
        ArffSaver saver = new ArffSaver();
        saver.setInstances(dataset);
        saver.setFile(new File("Personalized_Medication.arff"));
        saver.writeBatch();

        // Load ARFF
        DataSource source = new DataSource("Personalized_Medication.arff");
        Instances data = source.getDataSet();

        // Set class attribute
        data.setClassIndex(data.numAttributes() - 1);

        // Train/test split
        int trainSize = (int) Math.round(data.numInstances() * 0.7);
        int testSize = data.numInstances() - trainSize;

        Instances train = new Instances(data, 0, trainSize);
        Instances test = new Instances(data, trainSize, testSize);

        // Random Forest
        RandomForest rf = new RandomForest();
        rf.setNumTrees(100);
        rf.buildClassifier(train);

        // Evaluate
        Evaluation eval = new Evaluation(train);
        eval.evaluateModel(rf, test);

        System.out.println(eval.toSummaryString());
    }
}
