# Write tests for `reciprocal()`
[back to Test `opposite()`](test_opposite.md)

<br/>

| method | description |
| ------ | ----------- |
| `reciprocal()` &rarr; `Rational` | returns a new rational number which is the multiplicative inverse of this value. Throws an exception if *this* is 0.<br /><sup><sub>Multiplicative inverse means the product of the values is 1, e.g. <sup>2</sup>/<sub>3</sub> * <sup>3</sup>/<sub>2</sub> = 1 so <sup>3</sup>/<sub>2</sub> is the multiplicative inverse of <sup>2</sup>/<sub>3</sub>.</sub></sup> |

Suppose this method was already implemented. How would you know if it was correct?

<details>
  <summary>Expand after you try writing test(s) on your own</summary>

1. Given that I have created the `Rational` value `2/3`
1. When I compute the reciprocal of the value
1. Then the reciprocal should have numerator 3
1. And the reciprocal should have denominator 2

In `RationalTest.java`, add the following test in its own function:

```java
Rational value = new Rational(2, 3);
Rational reciprocal; = value.reciprocal();
assertThat("the numerator should be 3", reciprocal.numerator(), is(3));
assertThat("the denominatro should be 2", reciprocal.denominator(), is(2));
```

1. Given that I have created the `Rational` value `0`
1. When I compute the reciprocal of the value
1. Then an exception should be thrown

Add the following test in its own function:

```java
Rational value = new Rational(0);
assertThrows(IllegalArgumentException.class, value::reciprocal);
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

That should have been easy, too.
<br/>

Is your coverage still at 100%?  If not, add more tests.
<br/>
<br/>

[Next section: Write tests for multiplication](test_times.md)
