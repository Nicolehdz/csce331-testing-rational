# By now you should've somehow realized what you gotta do

[back to Test `times()`](test_times.md)

<br/>

Follow the **Test-Driven Development** process to, first, write tests and, second, write just enough code to pass the tests for each remaining functional requirement.  You should also consider whether your current tests adequately cover the required functionality.  If you see some functionality, or some case, which is not covered, you should create tests that verify correctness for those cases.

[Refer to the complete specification.](client_complete_specification.md)

## Test-Driven Development Process

1. Write a test for a single behavior you wish the software had.
   1. *Given* preconditions
      * Object having certain properties exists, e.g. `Rational r(2,3)`
   1. *When* actions
      * Object receives a certain message, e.g. `Rational opposite = r.opposite()`
   1. *Then* postconditions
      * The result has the expected value/properties, e.g. `assertThat("the opposite of 2/3 is -2/3", opposite.numerator(), is(-2))`
1. Run the test.
1. Verify the failure (as expected).
1. Write or fix the code in the simplest way possible.
1. Re-run the test.
1. Verify success (or go back to fixing the code).
1. Re-run all tests (to check for regression).
1. Verify all tests pass (or go back to fixing code).
1. Add and commit the changes.
1. Refactor, if needed (and then re-verify all tests pass).
1. Add and commit the changes.

<br/>

## Testing and Debugging

You will probably make errors when coding.  If you discover the error in the moment at which you created it, you should fix it immediately.  If you do not spot the error until after some unexpected behavior is observed (e.g. a bug is reported), you should adhere to the TDD process and capture the correct expected behavior in a test that reproduces the error *before* attempting to fix it in the code.

## Submission

[next section: Ready to Submit](submission.md)

<hr>

[table of contents](toc.md)