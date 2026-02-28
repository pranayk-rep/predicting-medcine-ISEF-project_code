public class randomforest {
    // dataset for testing 
    private RandomForest rf;

    public randomforest() {
        rf = new RandomForest();
        rf.setNumTrees(100);
        rf.setMaxDepth(0);
        rf.setNumFeatures(0);

    }
    // data set for training 
    public void train(Instances datset) throws Exception {
       int trainSize = (int) Math.round(dataset.numInstances()*0.7);
       int testSize = dataset.numInstances()- trainSize;
       
    }
      
