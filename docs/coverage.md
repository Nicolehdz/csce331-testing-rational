# Measuring coverage
[back to test Rational(int, int)](test_rational_int_int.md)

Coverage measures how much of our code our tests are exercising ("covering").  Our goal is to have as much coverage as we can, at least 90%.

<details>
   <summary>Does 100% coverage mean your code is correct?</summary>

100% coverage does <strong>not</strong> mean your code is correct. This is because you can have 100% coverage and still be failing or missing tests.
</details>

<details>
   <summary>Does 100% coverage and all tests passing mean your code is correct?</summary>

Even 100% coverage with all tests passing does not mean the code is correct.  This is because your tests could still be missing some critical value that reveals incorrect behavior.  Your tests could also be broken and passing on incorrect behavior.
</details>

Code which is covered is *possibly* tested.  Code which is not covered is **not tested**.

[next section: add jacoco to the project](add_jacoco.md)

<hr>

[table of contents](toc.md)