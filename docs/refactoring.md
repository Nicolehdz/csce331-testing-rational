# Refactoring
[back to add jacoco](add_jacoco.md)

Everytime you write some code and a new test passes, you should take a moment to reflect and review your work so far.  Ask yourself how the code or the tests be improved.  For now, I just want you to think about improving the readability and understandability of the code.
<br />

Think about these two things:
* Is there duplicated code that I can extract into a function to improve code reuse?
* Can I rename a class or function or variable to make the code easier to read and understand?

With that in mind, here is how we might be able to improve our code.

The constructor `Rational(int)` now looks almost the same as the the 2-argument version.  We can simplify it by delegating construction to the 2-argument constructor:

```java
public Rational(int a) {
   this(a, 1);
}
```

After making your refactoring changes, re-run the tests: `mvn test`.

This is will measure coverage and create the report, but will not check the coverage for you.  To check coverage, either go read the report yourself, or run `mvn verify` to have maven check it for you.

[next section: more testing for Rational(int, int)](test_rational_int_int_more.md)

<hr>

[table of contents](toc.md)