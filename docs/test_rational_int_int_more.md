# Is `Rational(int, int)` correct?
[back to refactoring](refactoring.md)

Nope.

Can you think of a test we could add to demonstrate that our code is not functionally correct?

Here is one:

> Given I have created a `Rational` value using `48` and `-72`
>
> Then the value should have numerator `-2`
>
> And the value should have denominator `3`

In `RationalTest.java`, add the following test in its own function:

```java
// Given I have created a `Rational` value using `48` and `-72`
Rational value = new Rational(48, -72);
// Then the value should have numerator `2`
assertThat("48 / -72 = -2 / 3", value.numerator(), is(-2));
// And the value should have denominator `3`
assertThat("48 / -72 = -2 / 3", value.denominator(), is(3));
```

What we are doing is called *Test-Driven Development*.

## Test-Driven Development Process

1. Write a test for a single behavior you wish the software had.
1. Run the test.
1. Verify the failure (as expected).
1. Write or fix the code in the simplest way possible.
1. Re-run the test.
1. Verify success (or go back to fixing the code).
1. Re-run all tests (to check for regression).
1. Verify all tests pass (or go back to fixing code).
1. Add and commit the changes.
1. Refactor, if needed (and then re-verify that all tests pass).
1. Add and commit the changes.

Are we done yet?

Almost!  Come up with more (at least 7) tests on your own to see if you can find a bug in your code.  If you cannot, that could be good (assuming you tried hard to break it).  If you can, that is good.  Fix it and re-test.  Add one test at a time.  As soon as a test fails, add or change just enough code to get it to pass before adding more tests.

<details>
  <summary>Hints</summary>

* Does it work if `b` is 0?
  * `import static org.junit.Assert.assertThrows;`
  * `assertThrows(IllegalArgumentException.class, () -> new Rational(1, 0));`
* Does it work with negative numbers?
  * a &lt; 0
  * b &lt; 0
  * a,b &lt; 0
* Does it work for numbers greater than, less than, equal to 1?
  * a &gt; b
  * a &lt; b
  * a = b

</details>

<br />

Do not move on until all tests are passing and coverage is above 90% (i.e. `mvn verify` succeeds).
<br />

At this point, it's fairly safe to say that the code we've written so far is probably correct.

<br/>
<br/>

[next section: Test `Rational(Rational)`](test_copy_constructor.md)

<hr>

[table of contents](toc.md)