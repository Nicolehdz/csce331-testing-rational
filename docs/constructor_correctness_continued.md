# Write Tests and Implement Rational()
[back to hamcrest](add_hamcrest_dependency.md)

We need to implement our test for the default constructor, `Rational()`:

> Given no preconditions,
>
> When I create a default `Rational` value,
>
> Then the value should have numerator 0,
>
> And the value should have denominator 0.


In `RationalTest.java`, in the function `testRational`, delete `assertTrue( true )` and replace with the following:

```java
// Given no preconditions

// When I create a default `Rational` value
Rational value = new Rational();
// Then the value should have numerator 0
assertThat("the numerator should be 0", value.numerator(), is(0));
// And the value should have denominator 1
assertThat("the denominator should be 1", value.denominator(), is(1));
```

At the top of the file, just under the `package` declaration, insert these import statements:

```java
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
```

Run tests: `mvn test`.

See that the build fails because methods `numerator()` and `denominator()` cannot be found.

What should we do? Think, then click here to [see the answer.](missing_methods.md)

Is there another test we could add to demonstrate that our code is not functionally correct? Think, then click here to [see my thoughts](constructor_correctness_test_thoughts.md)

[next section: test and implement Rational(int)](test_rational_int.md)

<hr>

[table of contents](toc.md)