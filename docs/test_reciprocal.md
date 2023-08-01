# Write tests for `reciprocal()`
[back to testing opposite()](test_opposite.md)

| method | description |
| ------ | ----------- |
| `reciprocal()` &rarr; `Rational` | returns a new rational number which is the multiplicative inverse of this value. Throws an exception if *this* is 0.<br /><sup><sub>Multiplicative inverse means the product of the values is 1, e.g. <sup>2</sup>/<sub>3</sub> * <sup>3</sup>/<sub>2</sub> = 1 so <sup>3</sup>/<sub>2</sub> is the multiplicative inverse of <sup>2</sup>/<sub>3</sub>.</sub></sup> |

Suppose this method was already implemented. How would you know if it was correct?

Here are two tests we can use: a happy path, and a sad path.

## Happy Path

A happy path is one in which nothing goes wrong.

> Given that I have created the `Rational` value `2/3`
>
> When I compute the reciprocal of the value
>
> Then the reciprocal should have numerator `3`
>
> And the reciprocal should have denominator `2`

In `RationalTest.java`, add the following test in its own function:

```java
Rational value = new Rational(2, 3);
Rational reciprocal; = value.reciprocal();
assertThat("the numerator should be 3", reciprocal.numerator(), is(3));
assertThat("the denominator should be 2", reciprocal.denominator(), is(2));
```

## Sad Path

A sad path is one in which something goes wrong.

> Given that I have created the `Rational` value `0`
>
> When I compute the reciprocal of the value
>
> Then an exception should be thrown

Add the following test in its own function:

```java
Rational value = new Rational(0);
assertThrows(IllegalArgumentException.class, value::reciprocal);
```

**IMPORTANT** Take care to strictly adhere to [the TDD process](tdd_process.md)

[next section: Test times(Rational)](test_times.md)

<hr>

[table of contents](toc.md)