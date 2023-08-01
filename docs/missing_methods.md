# What We Should Do About the Missing Methods
[back to Rational()](constructor_correctness_continued.md)

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

Since all tests are passing: `git add . ; git commit -m "all tests passing"`

[back to Rational()](constructor_correctness_continued.md)

<hr>

[table of contents](toc.md)