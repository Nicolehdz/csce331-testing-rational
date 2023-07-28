# Test the next constructor: Rational(int, int)
[Back to Test `Rational(int)`](test_rational_int.md)

<br />

Let's write a test for the 2-arg constructor.

| method | description |
| ------ | ----------- |
| `Rational(a, b: integers)` | Constructs the rational number <sup>*a*</sup>/<sub>*b*</sub> in canonical form.  Throws an exception if *b* is 0.<br /><sup><sub>Canonical form means the negative sign, if there is one, belongs to the numerator and the fraction is irreducible, e.g. <sup>48</sup>/<sub>-72</sub> is reducible to <sup>-2</sup>/<sub>3</sub>, which is the canonical form.</sub></sup> |

Suppose this method was already implemented. How would you know if it was correct?

<details>
  <summary>Expand after you think for yourself</summary>

To test whether this constructor is correct, we need to use it to create a `Rational` and then verify that the `Rational` has the correct numerator (`a`) and denominator (`b`).

1. Given that `a` is 2 and `b` is 3
1. When I create a `Rational` value using `a` and `b`
1. Then the value should have numerator `a`
1. And the value should have denominator `b`

In `RationalTest.java`, add the following test in its own function:

```java
// Given that `a` is 2 and `b` is 3
int a = 2;
int b = 3;
// When I create a `Rational` value using `a` and `b`
Rational value = new Rational(a, b);
// Then the value should have numerator `a = 2`
assertThat("the numerator should be 2", value.numerator(), is(a));
// And the value should have denominator `b = 3`
assertThat("the denominator should be 3", value.denominator(), is(b));
```

</details>

After you've written the new test, run the tests: `mvn test`.

It should fail because the only constructors the compiler knows about are the default constructor and the 1-arg constructor.  So, since we are trying to pass in two arguments, the compiler cannot compile because it doesn't know about Rational(int, int), because we haven't written it yet.

Go, now.  Write it!  Remember: only make just enough additions and changes to pass the tests.  Don't get ahead of your tests.

<details>
   <summary>What did you have to add and change?</summary>

```java
private int theNumerator;
private int theDenominator;      // added

public Rational(int a, int b) {  // added
   theNumerator = a;
   theDenominator = b;
}

public Rational(int a) {
   theNumerator = a;
   theDenominator = 1;           // added
}

public Rational() {
   this(0);
}

public int numerator() {
   return theNumerator;
}

public int denominator() {
   return theDenominator;        // changed
}
```

</details>

Test: `mvn test`.  You should see that the build succeeds because all tests are passing.

If all tests are passing: `git add .; git commit -m "all tests passing"`. Otherwise, debug your code or your test.

<details>
   <summary>Are we done!?</summary>

Maybe.
</details>

<details>
   <summary>How will we know!?</summary>

Coverage!
</details>

<br/>

[Next section: Measuring Coverage](coverage.md)
