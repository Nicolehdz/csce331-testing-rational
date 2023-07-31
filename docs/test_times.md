# Write tests for `times(Rational)`
[back to Test `reciproical()`](test_reciprocal.md)

<br/>

| method | description |
| ------ | ----------- |
| `times(r: Rational)` &rarr; `Rational` | returns a new rational number which is the product of *this* and the other value. |

Suppose this method was already implemented. How would you know if it was correct?


<details>
  <summary>Expand after you try writing a test on your own</summary>

1. Given that I have created `Rational`s *p* = 2/3 and *q* = 5/7
1. When I compute the *p* times *q*
1. Then the result should be 10/21

In `RationalTest.java`, add the following test in its own function:

```java
Rational p = new Rational(2, 3);
Rational q = new Rational(5, 7);
Rational result = p.times(q);
assertThat("2 * 5 = 10", result.numerator(), is(10));
assertThat("3 * 7 = 21", result.denominator(), is(21));
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

Still easy, no?
<br/>

Is your coverage at 100%?  If not, add more tests to cover what was missed.
<br/>
<br/>

[next section: Continue Test-Driven Development](the_rest_of_the_fing_tests.md)

<hr>

[table of contents](toc.md)