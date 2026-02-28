// confusion matrix results in the false postive and false negative result 
public class confusionmatrix<string> {
  //actual matrix/ prediction 
  private int [][] matrix = new int [2][2];
  // adds a prediction to the matrix 
  public void addPrediction(int actual, int predicted)  {
     matrix[actual][predicted]++;
    
     //prints the matrix 
      public void print() {}
     System.out.println("Confusion Matrix")
     System.out.println("TP + matrix[0][0]" +"   FP: " + matrix[1][0]);
     System.out.println("FN: " + matrix[0][1] + "   TN: " + matrix[1][1]);
    
     }
  }
  // accuracy calculation 
  public double accuracy() {
   int tp = matrix [0][0]];
   int tn = matrix [1] [1][;
   int total = tp+ FP + fn + tn matrix[0][1] + matrix[1][0];
      return(double)(tp+tn) / total;
   }

 public int getFalsepostives() {
    return matrix[1][0];

   public int getFalseNegatives(){
      return matrix [1][0];
   }
