# Test the copy constructor
[back to more testing of `Rational(int, int)`](test_rational_int_int_more.md)

<br/>

Let's write a test for the copy constructor.

| method | description |
| ------ | ----------- |
| `Rational(r: Rational)` | Constructs a copy of the given `Rational`. |

Suppose this method was already implemented. How would you know if it was correct?

<details>
  <summary>Expand after you think for yourself</summary>

To test whether this constructor is correct, we need to use it to create a `Rational` and then verify that the `Rational` has the correct numerator (`a`) and denominator (`b`).

1. Given that I have created the `Rational` value `2/3`
1. When I create a `Rational` value as a copy of the original `Rational`
1. Then the value should have numerator 2
1. And the value should have denominator 3

In `RationalTest.java`, add the following test in its own function:

```java
// Given that I have created the `Rational` value `2/3`
Rational original = new Rational(2, 3);
// When I create a `Rational` value as a copy of the original `Rational`
Rational value = new Rational(original);
// Then the value should have numerator 2
assertThat("the numerator should be 2", value.numerator(), is(2));
// And the value should have denominator 3
assertThat("the denominatro should be 3", value.denominator(), is(3));
```

</details>

<br/>

## Test-Driven Development Process

1. Write a test.
1. Run the test.
1. Verify the failure (as expected).
1. Fix the code.
1. Re-run the test.
1. Verify success (or go back to fixing the code)
1. Re-run all tests.
1. Verify all tests pass. (or go back to fixing code)
1. Refactor, if needed (and then re-verify all tests pass)
1. Add and commit the changes.

<br/>

## Refactor

Review your code.  Consider if refactoring makes sense right now.  Probably not.
<br/>
<br/>

[next section: Write tests for `opposite()`](test_opposite.md)

<hr>

[table of contents](toc.md)