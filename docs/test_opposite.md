# Write tests for `opposite()`
[back to Test `Rational(Rational)`](test_copy_constructor.md)

<br/>

| method | description |
| ------ | ----------- |
| `opposite()` &rarr; `Rational` | returns a new rational number which is the additive inverse of this value.<br /><sup><sub>Additive inverse means the sum of the values is 0, e.g. <sup>2</sup>/<sub>3</sub> + <sup>-2</sup>/<sub>3</sub> = 0 so <sup>-2</sup>/<sub>3</sub> is the additive inverse of <sup>2</sup>/<sub>3</sub>.</sub></sup> |

Suppose this method was already implemented. How would you know if it was correct?

<details>
  <summary>Expand after you try writing a test on your own</summary>

1. Given that I have created the `Rational` value `2/3`
1. When I compute the opposite of the value
1. Then the opposite should have numerator -2
1. And the opposite should have denominator 3

In `RationalTest.java`, add the following test in its own function:

```java
Rational value = new Rational(2, 3);
Rational opposite = value.opposite();
assertThat("the opposite of 2 is -2", opposite.numerator(), is(-2));
assertThat("the denominator should be 3", opposite.denominator(), is(3));
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

That should have felt quite easy.
<br/>
<br/>

[Next section: Write tests for `reciprocal()`](test_reciprocal.md)
