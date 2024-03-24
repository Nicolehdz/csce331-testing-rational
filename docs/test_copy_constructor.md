# Write Tests and Implement Rational(Rational)
[back to the test-driven development process](tdd_process.md)

Let's write a test for the copy constructor.

| method | description |
| ------ | ----------- |
| `Rational(r: Rational)` | Constructs a copy of the given `Rational`. |

Suppose this method was already implemented. How would you know if it was correct?

To test whether this constructor is correct, we need to use it to create a `Rational` and then verify that the `Rational` has the correct numerator and denominator.

> Given that I have created the `Rational` value `2/3`
>
>  When I create a `Rational` value as a copy of the original `Rational` value
>
> Then the copy's value should have numerator `2`
>
> And the copy's value should have denominator `3`

In `RationalTest.java`, add the following test in its own function:

```java
// Given that I have created the `Rational` value `2/3`
Rational original = new Rational(2, 3);
// When I create a `Rational` value as a copy of the original `Rational` value
Rational value = new Rational(original);
// Then the copy's value should have numerator 2
assertThat("the numerator should be 2", value.numerator(), is(2));
// And the copy's value should have denominator 3
assertThat("the denominator should be 3", value.denominator(), is(3));
```

**IMPORTANT** Take care to strictly adhere to [the TDD process](tdd_process.md)

[next section: test and implement opposite()](test_opposite.md)

<hr>

[table of contents](toc.md)
