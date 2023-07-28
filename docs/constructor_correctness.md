# Constructor correctness
[back to final specification](client_complete_specification.md)

Let's start with the default constructor.

| method | description |
| ------ | ----------- |
| `Rational()` | Constructs the rational number <sup>0</sup>/<sub>1</sub>. |

Suppose this method was already implemented. How would you know if it was correct?

<details>
  <summary>Expand after you think for yourself.</summary>

To test whether the default constructor is correct, we need to use it to create an instance of <code class="language-plaintext highlighter-rouge">Rational</code> and then verify that the <code class="language-plaintext highlighter-rouge">Rational</code> object has numerator 0 and denominator 1.

1. Given no preconditions
1. When I create a default `Rational` value
1. Then the value should have numerator 0
1. And the value should have denominator 0

</details>

Now, let's write a test for the code we wish we had. Then we will write just enough code to pass the test.

[next section: getting started with java unit testing](getting_started_with_java_unit_testing.md)
