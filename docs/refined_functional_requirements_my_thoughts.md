# My Thoughts on Refined Functional Requirements
[back to refining the functional requirements](refined_functional_requirements.md)

1. Construct a new `Rational`
   1. default: 0
      * input: none
      * output: none (constructors don't have return types)
      * side effect: the numerator is 0, the denominator is 1
      * errors: none
   1. from integer
      * input: `a: int`
      * output: none
      * side effect: the numerator is `a`, the denominator is 1
      * errors: none
   1. from numerator and denominator
      * input: `a: int, b: int`
      * output: none
      * side effect: the numerator is `a`, the denominator is `b`
      * errors: throws an exception if `b` is 0
   1. from `Rational`
      * input: `r: Rational`
      * output: none
      * side effect: the numerator is `r`'s numerator, the denominator is `r`'s denominator
      * errors: none
1. Get the components of a `Rational`
   1. numerator
      * input: none
      * output: int - the numerator of this `Rational`
      * side effect: none
      * errors: none
   1. denominator
      * input: none
      * output: int - the denominator of this `Rational`
      * side effect: none
      * errors: none
1. Compute the opposite of a `Rational`
   * input: none
   * output: `Rational` - the additive inverse of this `Rational`
   * side effect: none
   * errors: none
1. Compute the reciprocal of a `Rational`
   * input: none
   * output: `Rational` - the multiplicative inverse of this `Rational`
   * side effect: none
   * errors: throws an exception if this `Rational` is zero
1. Add `Rational`s
   * input: `r: Rational`
   * output: `Rational` - the sum of this `Rational` and `r`
   * side effect: none
   * errors: none
1. Subtract `Rational`s
   * input: `r: Rational`
   * output: `Rational` - the difference of this `Rational` and `r` (subtraction by `r`)
   * side effect: none
   * errors: none
1. Multiply `Rational`s
   * input: `r: Rational`
   * output: `Rational` - the product of this `Rational` and `r`
   * side effect: none
   * errors: none
1. Divide `Rational`s
   * input: `r: Rational`
   * output: `Rational` - the quotient of this `Rational` and `r`
   * side effect: none
   * errors: throws an exception if `r` is zero
1. Raise a `Rational` to an integer power
   * input: `n: int`
   * output: `Rational` - the result of raising this `Rational` to the power of `n`
   * side effect: none
   * errors: throws an exception if this `Rational` is zero and `n` is negative
1. Compare `Rational`s for
   1. equality
      * input: `o: Object`
      * output: `bool` - `true` iff this `Rational` has the name numerical value as `o`
      * side effect: none
      * errors: none
   1. greater than
      * input: `o: Object`
      * output: `bool` - `true` iff this `Rational` has a greater numerical value than `o`
      * side effect: none
      * errors: none
   1. less than
      * input: `o: Object`
      * output: `bool` - `true` iff this `Rational` has a lesser numerical value than `o`
      * side effect: none
      * errors: none
   1. is zero
      * input: none
      * output: `bool` - `true` iff this `Rational` has numerical value 0
      * side effect: none
      * errors: none
   1. is one
      * input: none
      * output: `bool` - `true` iff this `Rational` has numerical value 1
      * side effect: none
      * errors: none
   1. is minus one
      * input: none
      * output: `bool` - `true` iff this `Rational` has numerical value -1
      * side effect: none
      * errors: none
1. Pretty-print a `Rational` as a String
   * input: none
   * output: `String` - this `Rational` as a string, omitting denominator if 1
   * side effect: none
   * errors: none

[next section: (re)validate the requirements](client_complete_specification.md)

<hr>

[table of contents](toc.md)