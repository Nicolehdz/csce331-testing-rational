# Constructor correctness
[back to final specification](client_complete_specification.md)

Let's start with the default constructor.

| method | description |
| ------ | ----------- |
| `Rational()` | Constructs the rational number <sup>0</sup>/<sub>1</sub>. |

Suppose this method was already implemented. How would you know if it was correct?

To test whether the default constructor is correct, we need to use it to create an instance of `Rational` and then verify that the `Rational` object has numerator 0 and denominator 1.

> Given no preconditions,
>
> When I create a default `Rational` value,
>
> Then the value should have numerator 0,
>
> And the value should have denominator 0.

Now, let's write a test for the code we wish we had. Then we will write just enough code to pass the test.

[next section: getting started with java unit testing](getting_started_with_java_unit_testing.md)

<hr>

[table of contents](toc.md)