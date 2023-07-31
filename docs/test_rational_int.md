# Test Rational(int)
[back to constructor correctness, continued](constructor_correctness_continued.md)

Let's write a test for the 1-argument constructor.

| method | description |
| ------ | ----------- |
| `Rational(a: integer)` | Constructs the rational number <sup>*a*</sup>/<sub>1</sub>. |

Suppose this method was already implemented. How would you know if it was correct?

To test whether this constructor is correct, we need to use it to create a `Rational` and then verify that the `Rational` has the correct numerator (`a`) and denominator (`1`).

> Given that I have a constructed a `Rational` value using the argument `2`
>
> Then the value should have numerator `2`
>
> And the value should have denominator `1`

In `RationalTest.java`, add the following test in its own function:

```java
// Given that I have constructed a `Rational` value using the argument `2`
Rational value = new Rational(2);
// Then the value should have numerator `2`
assertThat("the numerator should be 2", value.numerator(), is(2));
// And the value should have denominator `1`
assertThat("the denominator should be 1", value.denominator(), is(1));
```

After you've written the new test, run the tests: `mvn test`.

It should fail because the only constructor the compiler knows about is the default constructor (which we didn't even write, yet).  So, since we are trying to pass in a single argument, the compiler cannot compile because it doesn't know about `Rational(int)``, because we haven't written it yet.

Go, now, and write it!  Remember: only make just enough additions and changes to pass the tests.  Don't get ahead of your tests (i.e. don't write code for which there is no test to justify it).

[next section: what changed?](what_changed_rational_int.md)

<hr>

[table of contents](toc.md)