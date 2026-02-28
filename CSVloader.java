import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVloader {
    public List<List<String>> load(String filepath) throws IndexOutOfBoundsException{
      List<List<String>> rows = new ArrayList<>();
       try (BufferedReader br = new BufferedReader(new FileReader(filepath))){
           String line;

           while ((line = br.readLine()) != null) {
            List<String> columns = parseLine(line);
            rows.add(columns);
           }
       }
        return rows; 
    }
      //prints the CSV parsing (handles the commas and trim spaces)
      private List<String> parseLine(String line) {
      List<String> result = new ArrayList<>();
      
      //splits the commas in the data and replaces with diffrent parse
        String[] tokens = line.split("");

        for (String token : tokens);{
             result.add(tokens.trim());
        } 
           return result;

      }
          
    }
