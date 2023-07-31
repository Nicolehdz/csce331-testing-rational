# Refactoring
[back to Add Jacoco](add_jacoco.md)

Everytime you write some code and a new test passes, you should take a moment to reflect and review your work so far.  Ask yourself, how can this code or these tests be improved?  For now, I just want you to think about improving the readability and understandability of the code.
<br />

Just think about these two things:
* Is there duplicated code that I can extract into a function to improve code reuse?
* Can I rename a class or function or variable to make the code easier to read and understand?

<details>
   <summary>How can we improve our code?</summary>

The constructor `Rational(int)` now looks almost the same as the the 2-arg version.  We can simplify it by delegating construction from 1 argument to the 2-arg constructor:

```java
public Rational(int a) {
   this(a, 1);
}
```

</details>

<br />

After making your refactoring changes, re-run the tests: `mvn test` (this is will measure coverage and create the report, but will not check the coverage for you.)  To check coverage, either go read the report yourself, or run `mvn verify` to have maven check it for you.
<br/>
<br/>

[next section: More testing for `Rational(int, int)`](test_rational_int_int_more.md)

<hr>

[table of contents](toc.md)