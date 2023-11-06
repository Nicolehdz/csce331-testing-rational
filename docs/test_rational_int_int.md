# Write Tests and Implement Rational(int, int)
[back to test Rational(int)](test_rational_int.md)

Let's write a test for the 2-arg constructor.

| method | description |
| ------ | ----------- |
| `Rational(a, b: integers)` | Constructs the rational number <sup>`a`</sup>/<sub>`b`</sub> in canonical form.  Throws an exception if `b` is 0.<br /><sup><sub>Canonical form means the negative sign, if there is one, belongs to the numerator and the fraction is irreducible, e.g. <sup>48</sup>/<sub>-72</sub> is reducible to <sup>-2</sup>/<sub>3</sub>, which is the canonical form.</sub></sup> |

Suppose this method was already implemented. How would you know if it was correct?

To test whether this constructor is correct, we need to use it to create a `Rational` and then verify that the `Rational` has the correct numerator (`a`) and denominator (`b`).

> Given that I have created a `Rational` value using arguments `2` and `3`
>
> Then the value should have numerator `2`
>
> And the value should have denominator `3`

In `RationalTest.java`, add the following test in its own function:

```java
// Given that I have created a Rational value using arguments `2`` and `3`
Rational value = new Rational(2, 3);
// Then the value should have numerator `2`
assertThat("the numerator should be 2", value.numerator(), is(2));
// And the value should have denominator `3`
assertThat("the denominator should be 3", value.denominator(), is(3));
```

After you've written the new test, run the tests: `mvn test`.

It should fail because the only constructors the compiler knows about are the default constructor and the 1-argument constructor.  So, since we are trying to pass in two arguments, the compiler cannot compile because it doesn't know about `Rational(int, int)`, because we haven't written it yet.

Go, now, write it!  Remember: only make just enough additions and changes to pass the tests.  Don't get ahead of your tests.

[next section: what changed?](what_changed_rational_int_int.md)

<hr>

[table of contents](toc.md)
