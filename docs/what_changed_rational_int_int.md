# What Did You Have To Add and Change for Rational(int, int)?
[back to test Rational(int)](test_rational_int_int.md)

Again (and as expected), this test drove a few additions and changes:

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

Test: `mvn test`.

You should see that the build succeeds because all tests are passing.

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

[next section: Measuring Coverage](coverage.md)

<hr>

[table of contents](toc.md)