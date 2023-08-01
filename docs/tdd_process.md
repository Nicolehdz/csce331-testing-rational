# Test-Driven Development Process
[back to testing Rational(int, int)](test_rational_int_int_more.md)<br/>
[back to testing Rational(Rational)](test_copy_constructor.md)<br/>
[back to testing opposite()](test_opposite.md)<br/>
[back to testing reciproical()](test_reciprocal.md)<br/>
[back to testing times(Rational)](test_reciprocal.md)<br/>

What we are doing is called **Test-Driven Development** (TDD).  The TDD process goes like this:

1. Write a test for a single behavior you wish the software had.
   1. **Given** *&lt;preconditions&gt;*
      * Object having certain properties exists, e.g. `Rational r(2)`
   1. **When** *&lt;actions&gt;*
      * Object receives a certain message, e.g. `Rational opposite = r.opposite()`
   1. **Then** *&lt;postconditions&gt;*
      * The result has the expected value/properties, e.g. `assertThat("the opposite of 2 is -2", opposite.numerator(), is(-2))`
1. Run the test.
1. Verify the failure (as expected).
1. Write or fix the code in the simplest way possible.
1. Re-run the test.
1. Verify success (or go back to fixing the code).
1. Re-run all tests (to check for regression).
1. Verify all tests pass (or go back to fixing code).
1. Verify coverage &ge; 90% (or, add more test cases).
1. Add and commit the changes.
1. Refactor, if needed (and then re-verify that all tests pass and coverage &ge; 90%).
1. Add and commit the changes.

This is also called the red-green-refactor cycle.  Red means a failing test.  Green means a passing test.  We start with a red (failing) test for some behavior we wish we had, then we write just enough code to turn that test green (passing).  Then, we refactor our code and tests to improve the organization and readability.

You need to take testing seriously no matter whether you do it before, during, or after you write the code.  Testing is harder than coding.  Much harder, sometimes.

Following the TDD process is not easy and requires discipline. But, if you do follow it, you should find that development is easier and faster.  You should find that you not only spend less time debugging, but you also spend less time writing code.

The more you practice TDD, the easier it will be to do it.

[next section: test Rational(Rational)](test_copy_constructor.md)

<hr>

[table of contents](toc.md)