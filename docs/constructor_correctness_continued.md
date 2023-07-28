# Constructor correctness, continued
[back to Hamcrest](add_hamcrest_dependency.md)

<br/>

We need to implement our test for the default constructor, `Rational()`:

1. Given no preconditions
1. When I create a default `Rational` value
1. Then the value should have numerator 0
1. And the value should have denominator 0

<br/>

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

Run tests: `mvn test`.  See that the build fails because methods `numerator()` and `denominator()` cannot be found.

<details>
   <summary>What should we do?</summary>

We should implement the missing methods!

Let's make them as simple as possible in order to pass the test:

In `Rational.java`, add these methods:

```java
public int numerator() {
   return 0;
}

public int denominator() {
   return 1;
}
```

Test: `mvn test`.  You should see that the build succeeds because all tests are passing.

Since all tests are passing: `git add .; git commit -m "all tests passing"`
</details>

<details>
   <summary>Are we done!?</summary>

No.
</details>

<br/>

<details>
   <summary>Can you think of a test we could add to demonstrate that our code is not functionally correct?</summary>

There's actually not much we can do about testing the default constructor in isolation.  We didn't even have to implement it in order to pass the test.  That's one of the tricky parts of testing: being clear on what you are actually testing.

We always want our unit tests to be as isolated and as independent as possible, to each test only one thing.  Our default constructor test relies on the methods `numerator()` and `denominator()`.  In fact, all of our constructor tests will rely on other methods.  So, we will need to be careful about testing this group of methods (the constructors and any other methods on which they and their tests rely).

The job of a constructor is to set the inital values of the attributes.  For a `Rational`, those attributes are simply the numerator and the denominator, which are accessed through the methods `numerator()` and `denominator()`.

These two methods, `numerator()` and `denominator()`, are special methods.  They are accessors.  They are so simple that we can implement them and assert their correctness by inspection, rather than by relying on tests to support the claim of their correctness.

Let's just assume we're good and push on.  We want to drive all of our development with our tests. We do not want to let our code get ahead of our tests.  If a test isn't failing, there's only one reason to touch the code: refactoring (which we will meet later).
</details>

<br/>

[Next section: Test `Rational(int)`](test_rational_int.md)
