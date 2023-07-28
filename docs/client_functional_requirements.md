# Client's Functional Requirements
[back to expected functional requirements](requirements.md)

After sending our list of expected functional requirements to the client, they look it over, think a bit about what they need to do, and reply with some additional functional requirements:

1. Construct a new `Rational`
   1. default: 0
   1. from integer
   1. from numerator and denominator
   1. from `Rational`
1. Get the components of a `Rational`
   1. numerator
   1. denominator
1. Compute the opposite of a `Rational`
1. Compute the reciprocal of a `Rational`
1. Add `Rational`s
1. Subtract `Rational`s
1. Multiply `Rational`s
1. Divide `Rational`s
1. Raise a `Rational` to an integer power
1. Compare `Rational`s for
   1. equality
   1. greater than
   1. less than
   1. is zero
   1. is one
   1. is minus one
1. Pretty-print a `Rational` as a String

Next, we need to take each of the operations and determine what are the inputs and the outputs and/or side-effects.  We also need to think about invalid inputs and how they should be handled.

[next section: refined functional requirements.](refined_functional_requirements.md)
