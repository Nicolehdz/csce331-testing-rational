# Write Tests and Implement opposite()
[back to Rational(Rational)](test_copy_constructor.md)

| method | description |
| ------ | ----------- |
| `opposite()` &rarr; `Rational` | returns a new rational number which is the additive inverse of this value.<br /><sup><sub>Additive inverse means the sum of the values is 0, e.g. <sup>2</sup>/<sub>3</sub> + <sup>-2</sup>/<sub>3</sub> = 0 so <sup>-2</sup>/<sub>3</sub> is the additive inverse of <sup>2</sup>/<sub>3</sub>.</sub></sup> |

Suppose this method was already implemented. How would you know if it was correct?

> Given that I have created the `Rational` value `2/3`
>
> When I compute the opposite of the value
>
> Then the opposite should have numerator `-2`
>
> And the opposite should have denominator `3`

In `RationalTest.java`, add the following test in its own function:

```java
Rational value = new Rational(2, 3);
Rational opposite = value.opposite();
assertThat("the opposite of 2 is -2", opposite.numerator(), is(-2));
assertThat("the denominator should be 3", opposite.denominator(), is(3));
```

**IMPORTANT** Take care to strictly adhere to [the TDD process](tdd_process.md)

[next section: test reciprocal()](test_reciprocal.md)

<hr>

[table of contents](toc.md)