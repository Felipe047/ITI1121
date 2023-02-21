public class Geometric extends AbstractSeries {

    int s;
    double a;

    Geometric() {
        s = 0;
        a = 0;
    }
    
    public double next() {

        a += 1 / Math.pow(2, s);

        s++;

        return a;

    }
}