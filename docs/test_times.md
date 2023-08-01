# Write Tests and Implement times(Rational)
[back to reciproical()](test_reciprocal.md)

| method | description |
| ------ | ----------- |
| `times(r: Rational)` &rarr; `Rational` | returns a new rational number which is the product of this value and `r`. |

Suppose this method was already implemented. How would you know if it was correct?

> Given that I have created `Rational`s representing 2/3 and 5/7
>
> When I compute the value of 2/3 times 5/7
>
> Then the result should be 10/21

In `RationalTest.java`, add the following test in its own function:

```java
Rational p = new Rational(2, 3);
Rational q = new Rational(5, 7);
Rational result = p.times(q);
assertThat("2 * 5 = 10", result.numerator(), is(10));
assertThat("3 * 7 = 21", result.denominator(), is(21));
```

**IMPORTANT** Take care to strictly adhere to [the TDD process](tdd_process.md)

[next section: continue test-driven development](the_rest_of_the_fing_tests.md)

<hr>

[table of contents](toc.md)