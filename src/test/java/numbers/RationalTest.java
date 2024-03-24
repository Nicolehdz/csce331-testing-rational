package numbers;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThrows;

public class RationalTest 
    extends TestCase
{
    /**
     * 
     *
     * @param testName name of the test case
     */
    public RationalTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RationalTest.class );
    }

    public void testRational()
    {
        Rational value1 = new Rational();
        assertThat("the numerator should be 0", value1.numerator(), is(0));
        assertThat("the denominator should be 1", value1.denominator(), is(1));

        Rational value2 = new Rational(2);
        assertThat("the numerator should be 2", value2.numerator(), is(2));
        assertThat("the denominator should be 1", value2.denominator(), is(1));

        Rational value3 = new Rational(2, 3);
        assertThat("the numerator should be 2", value3.numerator(), is(2));
        assertThat("the denominator should be 3", value3.denominator(), is(3));

        Rational value4 = new Rational(48, -72);
        assertThat("48 / -72 = -2 / 3", value4.numerator(), is(-2));
        assertThat("48 / -72 = -2 / 3", value4.denominator(), is(3));

        assertThrows(IllegalArgumentException.class, () -> new Rational(1, 0));

        Rational value5 = new Rational(-5, 2);
        assertThat("the numerator should be -5", value5.numerator(), is(-5));
        assertThat("the denominator should be 2", value5.denominator(), is(2));

        Rational value6 = new Rational(-4, -8);
        assertThat("-4 / -8 = 1 / 2", value6.numerator(), is(1));
        assertThat("-4 / -8 = 1 / 2", value6.denominator(), is(2));

        Rational value7 = new Rational(0, 5);
        assertThat("the numerator should be 0", value7.numerator(), is(0));
        assertThat("the denominator should be 1", value7.denominator(), is(1));

        Rational value8 = new Rational(0, -3);
        assertThat("the numerator should be 0", value8.numerator(), is(0));
        assertThat("the denominator should be 1", value8.denominator(), is(1));

        Rational value9 = new Rational(1000000, 500000);
        assertThat("1000000 / 500000 = 2 / 1", value9.numerator(), is(2));
        assertThat("1000000 / 500000 = 2 / 1", value9.denominator(), is(1));

        Rational original = new Rational(2, 3);
        Rational value10 = new Rational(original);
        assertThat("the numerator should be 2", value10.numerator(), is(2));
        assertThat("the denominator should be 3", value10.denominator(), is(3));

        Rational value11 = new Rational(2, 3);
        Rational opposite1 = value11.opposite();
        assertThat("the opposite of 2 is -2", opposite1.numerator(), is(-2));
        assertThat("the denominator should be 3", opposite1.denominator(), is(3));

        Rational value12 = new Rational(-2, 3);
        Rational opposite2 = value12.opposite();
        assertThat("the opposite of -2 is 2", opposite2.numerator(), is(2));
        assertThat("the denominator should be 3", opposite2.denominator(), is(3));

        Rational value13 = new Rational(0, 5);
        Rational opposite3 = value13.opposite();
        assertThat("the opposite of 0 is 0", opposite3.numerator(), is(0));
        assertThat("the denominator should be 1", opposite3.denominator(), is(1));

        Rational value14 = new Rational(2, 3);
        Rational reciprocal1 = value14.reciprocal();
        assertThat("the numerator should be 3", reciprocal1.numerator(), is(3));
        assertThat("the denominator should be 2", reciprocal1.denominator(), is(2));

        Rational value15 = new Rational(-2, 3);
        Rational reciprocal2 = value15.reciprocal();
        assertThat("the numerator should be -3", reciprocal2.numerator(), is(-3));
        assertThat("the denominator should be 2", reciprocal2.denominator(), is(2));

        Rational value16 = new Rational(-2, -3);
        // When I calculate its reciprocal
        Rational reciprocal3 = value16.reciprocal();
        // Then the reciprocal of -2/-3 should be 3/2
        assertThat("Reciprocal of -2/-3 should be 3/2", reciprocal3.numerator(), is(3));
        assertThat("Reciprocal of -2/-3 should be 3/2", reciprocal3.denominator(), is(2));

        Rational value17 = new Rational(0);
        assertThrows(IllegalArgumentException.class, value17::reciprocal);

        Rational p1 = new Rational(2, 3);
        Rational q1 = new Rational(5, 7);
        Rational result1 = p1.times(q1);
        assertThat("2 * 5 = 10", result1.numerator(), is(10));
        assertThat("3 * 7 = 21", result1.denominator(), is(21));

        // Test case for multiplication with one operand as 0
        Rational p2 = new Rational(2, 3);
        Rational q2 = new Rational(0);
        Rational result2 = p2.times(q2);
        assertThat("2 * 0 = 0", result2.numerator(), is(0));
        assertThat("3 * 1 = 1", result2.denominator(), is(1));

        // Test case for multiplication with two negative numbers
        Rational p3 = new Rational(-2, 3);
        Rational q3 = new Rational(-5, 7);
        Rational result3 = p3.times(q3);
        assertThat("-2 * -5 = 10", result3.numerator(), is(10));
        assertThat("3 * 7 = 21", result3.denominator(), is(21));

        // Test case for multiplication with one negative number
        Rational p4 = new Rational(2, 3);
        Rational q4 = new Rational(-5, 7);
        Rational result4 = p4.times(q4);
        assertThat("2 * -5 = -10", result4.numerator(), is(-10));
        assertThat("3 * 7 = 21", result4.denominator(), is(21));

        // Test case: Positive numbers
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);
        Rational result5 = r1.plus(r2);
        assertThat("1/2 + 3/4 = 5/4", result5.numerator(), is(5));
        assertThat("1/2 + 3/4 = 5/4", result5.denominator(), is(4));

        // Test case: Negative numbers
        Rational r3 = new Rational(-1, 3);
        Rational r4 = new Rational(-2, 5);
        Rational result6 = r3.plus(r4);
        assertThat("-1/3 + (-2/5) = -11/15", result6.numerator(), is(-11));
        assertThat("-1/3 + (-2/5) = -11/15", result6.denominator(), is(15));

        // Test case: Adding to zero
        Rational r5 = new Rational(1, 2);
        Rational r6 = new Rational(0);
        Rational result7 = r1.plus(r6);
        assertThat("1/2 + 0 = 1/2", result7.numerator(), is(1));
        assertThat("1/2 + 0 = 1/2", result7.denominator(), is(2));

        Rational r7 = new Rational(0);
        Rational r8 = new Rational(-3, 4);
        Rational result8 = r7.plus(r8);
        assertThat("0 + -3/4 = -3/4", result8.numerator(), is(-3));
        assertThat("0 + -3/4 = -3/4", result8.denominator(), is(4));

        // Test case: Positive numbers
        Rational m1 = new Rational(1, 2);
        Rational m2 = new Rational(3, 4);
        Rational result9 = m1.minus(m2);
        assertThat("1/2 - 3/4 = -1/4", result9.numerator(), is(-1));
        assertThat("1/2 - 3/4 = -1/4", result9.denominator(), is(4));

        // Test case: Negative numbers
        Rational m3 = new Rational(-1, 3);
        Rational m4 = new Rational(-2, 5);
        Rational result10 = m3.minus(m4);
        assertThat("-1/3 - (-2/5) = 1/15", result10.numerator(), is(1));
        assertThat("-1/3 - (-2/5) = 1/15", result10.denominator(), is(15));

        // Test case: Adding to zero
        Rational m5 = new Rational(1, 2);
        Rational m6 = new Rational(0);
        Rational result11 = m5.minus(m6);
        assertThat("1/2 - 0 = 1/2", result7.numerator(), is(1));
        assertThat("1/2 - 0 = 1/2", result7.denominator(), is(2));

        Rational m7 = new Rational(0);
        Rational m8 = new Rational(-3, 4);
        Rational result12 = m7.minus(m8);
        assertThat("0 - -3/4 = -3/4", result12.numerator(), is(3));
        assertThat("0 - -3/4 = -3/4", result12.denominator(), is(4));

        // Test case 1: Positive numbers
        Rational d1 = new Rational(3, 4);
        Rational d2 = new Rational(1, 2);
        Rational result13 = d1.dividedBy(d2);
        assertThat("3/4 / 1/2 = 3/2", result13.numerator(), is(3));
        assertThat("3/4 / 1/2 = 3/2", result13.denominator(), is(2));

        // Test case 2: Dividing by zero
        Rational d3 = new Rational(5, 7);
        Rational d4 = new Rational(0);
        assertThrows(IllegalArgumentException.class, () -> d3.dividedBy(d4));

        // Test case 3: Dividing zero by a number
        Rational d5 = new Rational(0);
        Rational d6 = new Rational(2, 3);
        Rational result14 = d5.dividedBy(d6);
        assertThat("0 / 2/3 = 0", result14.numerator(), is(0));
        assertThat("0 / 2/3 = 0", result14.denominator(), is(1));

        // Test case 4: Dividing negative numbers
        Rational d7 = new Rational(-1, 3);
        Rational d8 = new Rational(-2, 5);
        Rational result15 = d7.dividedBy(d8);
        assertThat("-1/3 / -2/5 = 5/6", result15.numerator(), is(5));
        assertThat("-1/3 / -2/5 = 5/6", result15.denominator(), is(6));

        // Test case 1: Positive power
        Rational base1 = new Rational(2, 3);
        Rational result16 = base1.raisedToThePowerOf(2);
        assertThat("2/3 ^ 2 = 4/9", result16.numerator(), is(4));
        assertThat("2/3 ^ 2 = 4/9", result16.denominator(), is(9));

        // Test case 2: Negative power
        Rational base2 = new Rational(3, 4);
        Rational result17 = base2.raisedToThePowerOf(-2);
        assertThat("3/4 ^ -2 = 16/9", result17.numerator(), is(16));
        assertThat("3/4 ^ -2 = 16/9", result17.denominator(), is(9));

        // Test case 3: Power of zero
        Rational base3 = new Rational(5, 6);
        Rational result18 = base3.raisedToThePowerOf(0);
        assertThat("5/6 ^ 0 = 1", result18.numerator(), is(1));
        assertThat("5/6 ^ 0 = 1", result18.denominator(), is(1));

        // Test case 4: Zero raised to a positive power
        Rational base4 = new Rational(0, 7);
        Rational result19 = base4.raisedToThePowerOf(3);
        assertThat("0/7 ^ 3 = 0/1", result19.numerator(), is(0));
        assertThat("0/7 ^ 3 = 0/1", result19.denominator(), is(1));

        Rational zeroNumerator = new Rational(0);
        int negativePower = -2;

        try {
            Rational result = zeroNumerator.raisedToThePowerOf(negativePower);
            fail("Expected IllegalArgumentException, but got result: " + result);
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot raise zero to a negative power.", e.getMessage());
        }

        // Test case: Equal rationals
        Rational c1 = new Rational(2, 3);
        Rational c2 = new Rational(4, 6);
        assertTrue(c1.equals(c2));

        // Test case: Different rationals
        Rational c3 = new Rational(1, 2);
        Rational c4 = new Rational(0);
        assertFalse(c3.equals(c4));

        Rational c5 = new Rational(-50, 100); 
        Rational c6 = new Rational(-1, 2); 
        assertTrue(c5.equals(c6));

        // Test case: Zero numerator, different denominators
        Rational c7 = new Rational(0, 5);
        Rational c8 = new Rational(0, -7);
        assertTrue(c7.equals(c8));

        // Test case: Different prime numerators and denominators
        Rational c9 = new Rational(5, 7);
        Rational c10 = new Rational(11, 13);
        assertFalse(c9.equals(c10));

        // Test case: Zero numerator, zero denominator
        Rational c11 = new Rational(0, 1);
        Rational c12 = new Rational(0);
        assertTrue(c11.equals(c12));

        Rational c13 = new Rational(1, 2);
        assertFalse(c13.equals(null));  

        Rational c14 = new Rational(3, 4);
        Object obj = new Object();
        assertFalse(c14.equals(obj));

        Rational c15 = new Rational(2, 5);
        Rational c16 = new Rational(2, 7);
        assertFalse(c15.equals(c16));

        Rational rationall = new Rational(3, 5);
        assertTrue(rationall.equals(rationall));

        Rational cc1 = new Rational(1, 2);
        Rational cc2 = new Rational(1, 3);
        assertTrue(cc1.greaterThan(cc2));

        Rational cc3 = new Rational(-1, 2);
        Rational cc4 = new Rational(1, 3);
        assertFalse(cc3.greaterThan(cc4));

        Rational cc5 = new Rational(0, 1);
        Rational cc6 = new Rational(0, -1);
        assertFalse(cc5.greaterThan(cc6));

        Rational cc7 = new Rational(1, 2);
        Rational cc8 = new Rational(0);
        assertTrue(cc7.greaterThan(cc8));

        Rational ccc1 = new Rational(1, 2);
        Rational ccc2 = new Rational(1, 3);
        assertFalse(ccc1.lessThan(cc2));

        Rational ccc3 = new Rational(-1, 2);
        Rational ccc4 = new Rational(1, 3);
        assertTrue(ccc3.lessThan(cc4));

        Rational ccc5 = new Rational(0, 1);
        Rational ccc6 = new Rational(0, -1);
        assertFalse(ccc5.lessThan(ccc6));

        Rational ccc7 = new Rational(1, 2);
        Rational ccc8 = new Rational(0);
        assertFalse(ccc7.lessThan(ccc8));

        // Test case: Greater than
        Rational ccc9 = new Rational(-1, 2);
        Rational ccc10 = new Rational(-1, 3);
        assertTrue(ccc9.lessThan(ccc10));

        // Test case: Less than
        Rational ccc11 = new Rational(1, 2);
        Rational ccc12 = new Rational(2, 3);
        assertTrue(ccc11.lessThan(ccc12));

        // Test case: Equal
        Rational ccc13 = new Rational(3, 4);
        Rational ccc14 = new Rational(3, 4);
        assertFalse(ccc13.lessThan(ccc14));


        // Test case 1: isZero
        Rational zero = new Rational(0);
        assertTrue(zero.isZero());

        // Test case 2: isZero
        Rational nonZero1 = new Rational(3, 4);
        assertFalse(nonZero1.isZero());

        // Test case 3: isZero
        Rational nonZero2 = new Rational(2, -3);
        assertFalse(nonZero2.isZero());

        // Test case 4: isOne
        Rational one = new Rational(1);
        assertTrue(one.isOne());

        // Test case 5: isOne
        Rational notOne1 = new Rational(2, 3);
        assertFalse(notOne1.isOne());

        // Test case 6: isOne
        Rational notOne2 = new Rational(-100,-100);
        assertTrue(notOne2.isOne());

        // Test case 7: isMinusOne
        Rational minusOne = new Rational(-1);
        assertTrue(minusOne.isMinusOne());

        // Test case 8: isMinusOne
        Rational notMinusOne1 = new Rational(1, 2);
        assertFalse(notMinusOne1.isMinusOne());

        // Test case 8: isMinusOne
        Rational notMinusOne2 = new Rational(-6, 6);
        assertTrue(notMinusOne2.isMinusOne());

        // Test case: Fraction with denominator 1
        Rational fractionWithDenominator1 = new Rational(5, 1);
        String ts1 = fractionWithDenominator1.toString();
        assertEquals("toString should return '5' for fraction with denominator 1", "5", ts1);

        // Test case: Fraction with denominator not equal to 1
        Rational fractionWithDenominatorNot1 = new Rational(3, 4);
        String ts2 = fractionWithDenominatorNot1.toString();
        assertEquals("toString should return '3/4' for fraction with denominator not equal to 1", "3/4", ts2);

        // Test case 1: Fraction with negative numerator
        Rational negativeFraction = new Rational(-3, 4);
        String ts3 = negativeFraction.toString();
        assertEquals("toString should return '-3/4'", "-3/4", ts3);

        // Test case 2: Fraction with negative denominator
        Rational negativeDenominator = new Rational(3, -4);
        String ts4 = negativeDenominator.toString();
        assertEquals("toString should return '-3/4'", "-3/4", ts4);

        // Test case 3: Fraction with both negative numerator and denominator
        Rational negativeBoth = new Rational(-3, -4);
        String ts5 = negativeBoth.toString();
        assertEquals("toString should return '3/4'", "3/4", ts5);

        // Test case 4: Fraction with denominator 1
        Rational denominator1 = new Rational(5, 1);
        String ts6 = denominator1.toString();
        assertEquals("toString should return '5'", "5", ts6);

        // Test case: Rational is greater than an Integer
        Rational rational = new Rational(3, 4);
        Number integerNumber = 1;
        assertFalse(rational.greaterThan(integerNumber));

        // Test case: Rational is greater than a Double
        Rational rational2 = new Rational(5, 6);
        Number doubleNumber = 0.5;
        assertTrue(rational2.greaterThan(doubleNumber));

        // Test case: Rational is less than an Integer
        Rational rational3 = new Rational(2, 3);
        Number intNumber2 = 3;
        assertTrue(rational3.lessThan(intNumber2));

        // Test case: Rational is less than a Double
        Rational rational5 = new Rational(1, 2);
        Number doubleNumber3 = 1.5;
        assertTrue(rational5.lessThan(doubleNumber3));

        // Test case: Unsupported Number type
        Rational rational6 = new Rational(2, 5);
        Number unsupportedNumber = 5L; // Long is unsupported
        assertThrows(IllegalArgumentException.class, () -> rational6.greaterThan(unsupportedNumber));
        assertThrows(IllegalArgumentException.class, () -> rational6.lessThan(unsupportedNumber));

        // Test case: Rational is greater than zero
        Rational rational7 = new Rational(3, 4);
        assertTrue(rational7.greaterThan(0));

        // Test case: Rational is less than zero
        Rational rational8 = new Rational(-2, 3);
        assertTrue(rational8.lessThan(0));
        assertFalse(rational8.lessThan(-3));

        Rational rational123 = new Rational(3, 5);
        assertTrue(rational123.greaterThan(0.2));
        assertTrue(rational123.lessThan(0.8));

        Rational rational321 = new Rational(3, 5);
        assertFalse(rational321.greaterThan(0.8));
        assertFalse(rational321.lessThan(0.2));
    }

}
