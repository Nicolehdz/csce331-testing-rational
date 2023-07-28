# Test Rational(int)
[Back to Constructor Correctness, continued](constructor_correctness_continued.md)

<br />

Let's write a test for the 1-arg constructor.

| method | description |
| ------ | ----------- |
| `Rational(a: integer)` | Constructs the rational number <sup>*a*</sup>/<sub>1</sub>. |

Suppose this method was already implemented. How would you know if it was correct?

<details>
  <summary>Expand after you think for yourself.</summary>

To test whether this constructor is correct, we need to use it to create a `Rational` and then verify that the `Rational` has the correct numerator (`a`) and denominator (`1`).

1. Given that `a` is 2
1. When I create a `Rational` value using `a`
1. Then the value should have numerator `a = 2`
1. And the value should have denominator `1`

In `RationalTest.java`, add the following test in its own function:

```java
// Given that `a` is 2
int a = 2;
// When I create a `Rational` value using `a`
Rational value = new Rational(a);
// Then the value should have numerator `a = 2`
assertThat("the numerator should be 2", value.numerator(), is(a));
// And the value should have denominator `1`
assertThat("the denominator should be 1", value.denominator(), is(1));
```

</details>

<br/>

After you've written the new test, run the tests: `mvn test`.

It should fail because the only constructor the compiler knows about is the default constructor (which we didn't even write, yet).  So, since we are trying to pass in a single argument, the compiler cannot compile because it doesn't know about Rational(int), because we haven't written it yet.

Go, now.  Write it!  Remember: only make just enough additions and changes to pass the tests.  Don't get ahead of your tests (i.e. don't write code for which a test does not exist).

<details>
   <summary>What did you have to add and change?</summary>

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

</details>

<br/>

Test: `mvn test`.  You should see that the build succeeds because all tests are passing.

If all tests are passing: `git add .; git commit -m "all tests passing"`. Otherwise, debug your code or your test.

<details>
   <summary>Are we done!?</summary>

No!
</details>

<br/>

<details>
   <summary>Can you think of a test we could add to demonstrate that our code is not functionally correct?</summary>

We need to test the 2-arg constructor.

</details>

<br />

[Next section: Test `Rational(int, int)`](test_rational_int_int.md)
