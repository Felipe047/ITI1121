public class Rational {

    private int numerator;
    private int denominator;

    // constructors

    public Rational(int numerator) {
	    // Your code h
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
	    // Your code here
        this.denominator = denominator;
        this.numerator = numerator;
        this.reduce();
    }

    // getters

    public int getNumerator() {
	    return numerator;
    }

    public int getDenominator() {
	    return denominator;
    }

    // instance methods

    public Rational plus(Rational other) {
	    // Your code here
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        Rational returnVal = new Rational(newNumerator, newDenominator);
        returnVal.reduce();
        return returnVal;
    }

    public static Rational plus(Rational a, Rational b) {
    	// Your code here
        int newNumerator = a.numerator * b.denominator + b.numerator * a.denominator;
        int newDenominator = a.denominator * b.denominator;
        Rational returnVal = new Rational(newNumerator, newDenominator);
        returnVal.reduce();
        
        return returnVal;
    }

    // Transforms this number into its reduced form

    private void reduce() {
        // Your code here
        if (this.denominator < 0 && this.numerator < 0) {
            this.denominator = - this.denominator;
            this.numerator = - this.numerator;
        }
        for (int i = this.denominator; i >= 1; i--) {
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                this.denominator = this.denominator / i;
                this.numerator = this.numerator /i;
                break;
            }
        }
    }

    // Euclid's algorithm for calculating the greatest common divisor
    private int gcd(int a, int b) {
      // Note that the loop below, as-is, will time out on negative inputs.
      // The gcd should always be a positive number.
      // Add code here to pre-process the inputs so this doesn't happen.

    	while (a != b)
    	    if (a > b)
    		     a = a - b;
    	    else
    		     b = b - a;
    	return a;
    }

    public int compareTo(Rational other) {
        // Your code here
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        return newNumerator;
    }

    public boolean equals(Rational other) {
        // Your code here
        boolean result = false;
        other.reduce();
        if (other.denominator == this.denominator && other.numerator == this.numerator) {
            result = true;
        }
        return result;
    }

    public String toString() {
    	String result;
    	if (denominator == 1) {
    	    // Your code here
            Integer o = this.numerator;
            result = o.toString();
    	} else {
    	    // Your code here
            Integer n = numerator;
            Integer d = denominator;
            result = n.toString() + "/" + d.toString();
    	}
    	return result;
    }

}