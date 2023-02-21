public class Arithmetic extends AbstractSeries {

    int s;
    double a;

    Arithmetic() {
        s = 0;
        a = 0;
    }

    public double next() {

        s++;

        a += s;

        return a;
        
    }
}