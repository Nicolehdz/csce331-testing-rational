package numbers;

public class Rational 
{
    private int theNumerator;
    private int theDenominator;      

    public Rational() {
        this(0);
    }

    public Rational(int a) {
        this(a, 1);
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
        this.theNumerator = r.theNumerator;
        this.theDenominator = r.theDenominator;
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

    public Rational times(Rational r) {
        int newNumerator = this.theNumerator * r.theNumerator;
        int newDenominator = this.theDenominator * r.theDenominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational plus(Rational r) {
        // Cross-multiply to find a common denominator
        int commonDenominator = this.theDenominator * r.theDenominator;

        // Calculate new numerators
        int newNumerator1 = this.theNumerator * r.theDenominator;
        int newNumerator2 = r.theNumerator * this.theDenominator;

        // Sum of numerators
        int sumNumerator = newNumerator1 + newNumerator2;

        // Create a new Rational with the sum
        return new Rational(sumNumerator, commonDenominator);
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
        // Check for the case where the numerator is zero and the power is negative
        if (this.theNumerator == 0 && n < 0) {
            throw new IllegalArgumentException("Cannot raise zero to a negative power.");
        } else if (n < 0) {
            // For a negative power, swap numerator and denominator and raise to the positive power
            return new Rational((int) Math.pow(this.theDenominator, -n), (int) Math.pow(this.theNumerator, -n));
        } else if (n > 0) {
            // Raise to the positive power
            return new Rational((int) Math.pow(this.theNumerator, n), (int) Math.pow(this.theDenominator, n));
        } else {
            // Power of zero, result is 1
            return new Rational(1);
        }
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return this.theNumerator == rational.theNumerator && this.theDenominator == rational.theDenominator;
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
            // If the denominator is 1, print only the numerator
            return Integer.toString(this.theNumerator);
        } else {
            // Otherwise, print the numerator/denominator
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
}
