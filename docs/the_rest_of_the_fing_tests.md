# By Now You Should've Somehow Realized What You Gotta Do
[back to times(Rational)](test_times.md)

Follow [the Test-Driven Development process](tdd_process.md) for each remaining functional requirement.

You should also consider whether your current tests adequately cover the required functionality.  If you see some functionality, or some case, which is not covered, you should create tests that verify correctness for those cases.

[Refer to the complete specification.](client_complete_specification.md)

## Testing and Debugging

You will probably make errors when coding.  If you discover the error in the moment at which you created it, you should fix it immediately.  If you do not spot the error until after some unexpected behavior is observed (e.g. a bug is reported), you should adhere to the TDD process and capture the correct expected behavior in a test that reproduces the error *before* attempting to fix it in the code.

## Tips for Testing

* be "maliciously thorough" in your tests
  + pick extreme values
  + try to break your code
  + try to invalidate any and all assumptions you made in your code
    - e.g. if you have a comparison with a numeric literal, create tests at and around that number
      * answer the question: why that number and not +/- 1 or +/- 2?).
      * similarly, answer the question: why > and not >=, or vice versa?
* test your tests.
  + a good test will pass when the code is correct and fail when the code is incorrect.
  + so, break your code on purpose and make sure that some test catches it
    - e.g. change the direction or boundary of a comparison, use default values instead of computed values, change operators, etc.
* if you are finding it challenging to increase coverage or strength by adding tests, try simplifying the code.
  + better yet: write simple code in the first place!
  + simple code is easier to test.

[next section: submission](submission.md)

<hr>

[table of contents](toc.md)
