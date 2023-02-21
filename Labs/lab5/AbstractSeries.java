public abstract class AbstractSeries implements Series {

    public double[] take(int k) {

        double[] returnVal = new double[k];

        for (int i = 0; i < returnVal.length; i++) {
            returnVal[i] = next();
        }

        return returnVal;
        
    }

}