package numbers;

public class Rational extends Number implements Comparable<Number> 
{    
    private int theNumerator;
    private int theDenominator;

    public Rational() { 
        this(0, 1); 
    }
    

    public Rational(int a) { 
        this(a, 1); 
    }
    

    public static int VerifiedMultiplication(int a, int b){
        int product = a * b;
        double x = a; double y = b;
        if(product != x * y) throw new IllegalArgumentException("Overflow when multiplying");

        return product;
    }


    public static int VerifiedAddition(int a, int b){
        int sum = a + b;
        double x = a; double y = b;
        if(sum != x + y) throw new IllegalArgumentException("Overflow when adding");
        return sum;
    }


    private static int gcd(int n, int d) {
        double a = n; a = Math.abs(a);
        double b = d; b = Math.abs(b);
        return (int)(gcd(b, a % b)); 
    }

    private static double gcd(double n, double d) {
        if (d == 0) {
        return n;
        }
        else {
        return gcd(d, n % d); 
        }
    }


    private static int lcd(int n, int d) {
        int GCD = gcd(n, d); 
        return (n / GCD) * d; 
    }
    

    public Rational(int a, int b) {  
        if (b == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        
        int gcd = findGCD(Math.abs(a), Math.abs(b));
        this.theNumerator = (b > 0) ? a / gcd : -a / gcd;
        this.theDenominator = Math.abs(b) / gcd;
    }

    public Rational(Rational r) {
        if (r == null) throw new NullPointerException("A rational object can't be null");
        theNumerator = r.theNumerator;
        theDenominator = r.theDenominator;
    }

    public int numerator() {
        return theNumerator;
    }

    public int denominator() {
        return theDenominator;        
    }

    public Rational opposite() {
        return new Rational(-this.theNumerator, this.theDenominator);
    }

    public Rational reciprocal() {
        if (this.theNumerator == 0) {
            throw new IllegalArgumentException("Cannot calculate reciprocal of zero.");
        }
        return new Rational(this.theDenominator, this.theNumerator);
    }
    
    
    public Rational times(Rational r){
        if (r == null) return null;
        return new Rational(VerifiedMultiplication(this.theNumerator, r.theNumerator), VerifiedMultiplication(this.theDenominator, r.theDenominator));
    }

    public Rational plus(Rational r){
        if (r == null) return null;
        int b = lcd(theDenominator, r.theDenominator);
        int x = VerifiedMultiplication(theNumerator, (b / theDenominator));
        int y = VerifiedMultiplication(r.theNumerator, (b / r.theDenominator));
        int a = VerifiedAddition(x, y);
        return new Rational(a, b);
    }

    public Rational minus(Rational r) {
        // Cross-multiply to find a common denominator
        int commonDenominator = this.theDenominator * r.theDenominator;

        // Calculate new numerators
        int newNumerator1 = this.theNumerator * r.theDenominator;
        int newNumerator2 = r.theNumerator * this.theDenominator;

        // Difference of numerators
        int differenceNumerator = newNumerator1 - newNumerator2;

        // Create a new Rational with the difference
        return new Rational(differenceNumerator, commonDenominator);
    }
    
    public Rational dividedBy(Rational r) {
        // Ensure the denominator of the divisor is not zero
        if (r.theNumerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }

        int newNumerator = this.theNumerator * r.theDenominator;
        int newDenominator = this.theDenominator * r.theNumerator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational raisedToThePowerOf(int n) {
        if (this.theNumerator == 0 && n < 0) {
            throw new IllegalArgumentException("Cannot raise zero to a negative power.");
        } else if (n < 0) {
            return new Rational((int) Math.pow(this.theDenominator, -n), (int) Math.pow(this.theNumerator, -n));
        } else if (n > 0) {
            return new Rational((int) Math.pow(this.theNumerator, n), (int) Math.pow(this.theDenominator, n));
        } else {
            return new Rational(1);
        }
    }
   
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return this.theNumerator == rational.theNumerator && this.theDenominator == rational.theDenominator;
    }
    @Override
    public double doubleValue() {
        return (double) theNumerator / theDenominator;
    }
    @Override
    public int intValue() {
        return theNumerator / theDenominator;
    }
    @Override
    public long longValue() {
        return (long) theNumerator / theDenominator;
    }
    @Override
    public float floatValue() {
        return (float) theNumerator / theDenominator;
    }
    public boolean greaterThan(Number n) {
        if (n instanceof Integer) {
            return this.theNumerator > n.intValue() * this.theDenominator;
        } else if (n instanceof Double) {
            return this.theNumerator > n.doubleValue() * this.theDenominator;
        } else {
            throw new IllegalArgumentException("Unsupported Number type");
        }
    }
    
    public boolean greaterThan(Rational r) {
        return this.theNumerator * r.theDenominator > r.theNumerator * this.theDenominator;
    }

    public boolean lessThan(Number n) {
        if (n instanceof Integer) {
            return this.theNumerator < n.intValue() * this.theDenominator;
        } else if (n instanceof Double) {
            return this.theNumerator < n.doubleValue() * this.theDenominator;
        } else {
            throw new IllegalArgumentException("Unsupported Number type");
        }
    }
    

    public boolean lessThan(Rational r) {
        return this.theNumerator * r.theDenominator < r.theNumerator * this.theDenominator;
    }   

    public boolean isZero() {
        return this.theNumerator == 0;
    }

    public boolean isOne() {
        return this.theNumerator == this.theDenominator;
    }

    public boolean isMinusOne() {
        return this.theNumerator == -this.theDenominator;
    }

    public String toString() {
        if (this.theDenominator == 1) {
            return Integer.toString(this.theNumerator);
        } else {
            return this.theNumerator + "/" + this.theDenominator;
        }
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    
    @Override
    public int compareTo(Number n) {
        if(equals(n)) { return 0; }
        else if(greaterThan(n)) { return 1; }
        else { return -1; }
    }
}