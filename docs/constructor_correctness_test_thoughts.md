# My Thoughts on Testing the Default Constructor
[back to Rational()](constructor_correctness_continued.md)

There's actually not much we can do about testing the default constructor in isolation.  We didn't even have to implement it in order to pass the test.  That's one of the tricky parts of testing: being clear on what you are actually testing.

We always want our unit tests to be as isolated and as independent as possible, to each test only one thing.  Our default constructor test relies on the methods `numerator()` and `denominator()`.  In fact, all of our constructor tests will rely on other methods.  So, we will need to be careful about testing this group of methods (the constructors and any other methods on which they and their tests rely).

The job of a constructor is to set the inital values of the attributes.  For a `Rational`, those attributes are simply the numerator and the denominator, which are accessed through the methods `numerator()` and `denominator()`.

These two methods, `numerator()` and `denominator()`, are special methods.  They are accessors.  They are so simple that we can implement them and assert their correctness by inspection, rather than by relying on tests to support the claim of their correctness.

Let's just assume we're good and push on with testing.  We want to drive all of our development with our tests. We do not want to let our code get ahead of our tests.  If a test isn't failing, there's only one reason to touch the code: refactoring (which we will meet later).

[back to Rational()](constructor_correctness_continued.md)

<hr>

[table of contents](toc.md)