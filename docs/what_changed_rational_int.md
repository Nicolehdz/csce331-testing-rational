# What Changed for Rational(int)?
[back to Rational(int)](test_rational_int.md)

Turns out, this one little test required some relatively big changes.

```java
private int theNumerator;  // added

public Rational(int a) {   // added
   theNumerator = a;
}

public Rational() {        // added
   this(0);
}

public int numerator() {
   return theNumerator;    // changed
}
```


Test: `mvn test`.

You should see that the build succeeds because all tests are passing.

If all tests are passing: `git add . ; git commit -m "all tests passing"`. Otherwise, debug your code or your test.

<details>
   <summary>Are we done!?</summary>

No!
</details>

<details>
   <summary>Can you think of a test we could add to demonstrate that our code is not functionally correct?</summary>

We need to test the 2-argument constructor.
</details>

[next section: test and implement Rational(int, int)](test_rational_int_int.md)

<hr>

[table of contents](toc.md)