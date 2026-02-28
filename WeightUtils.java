import java.util.List;
import project.personalized_medication;

public class WeightUtils {

    public double averageWeight(List<String[]> rows) {
        double total = 0;
        int count = 0;

        for (String[] values : rows) {
            double weight = Double.parseDouble(values[0]); // column 0 = weight
            total += weight;
            count++;
        }

        return count == 0 ? 0 : total / count;
    }

    public double averageHeight(List<String[]> rows) {
        double total = 0;
        int count = 0;
