# Complete Specification
[back to my thoughts on the refined functional requirements](refined_functional_requirements_my_thoughts.md)

We sent our refined functional requirements to the client. The client reviewed the requirements (and, hopefully, thought a bit about what they need to do and how they want to do it) and replied with these final specifications:

`Rational` must extend `Number` and implement `Comparable<Number>`.

| method | description |
| ------ | ----------- |
| `Rational()` | Constructs the rational number <sup>0</sup>/<sub>1</sub>. |
| `Rational(a: integer)` | Constructs the rational number <sup>`a`</sup>/<sub>1</sub>. |
| `Rational(a, b: integers)` | Constructs the rational number <sup>`a`</sup>/<sub>`b`</sub> in canonical form.<br />Throws an `IllegalArgumentException` if `b` is 0 or the operation would cause integer overflow.<br /><sup><sub>Canonical form means the negative sign, if there is one, belongs to the numerator and the fraction is irreducible, e.g. <sup>48</sup>/<sub>-72</sub> is reducible to <sup>-2</sup>/<sub>3</sub>, which is the canonical form.</sub></sup> |
| `Rational(r: Rational)` | Constructs a copy of the given `Rational`. |
| `numerator()` &rarr; `integer` | Returns the numerator of this value. |
| `denominator()` &rarr; `integer` | Returns the denominator of this value. |
| `opposite()` &rarr; `Rational` | Returns a new rational number which is the additive inverse of this value.<br />Throws an `IllegalArgumentException` if the operation would cause integer overflow.<br /><sup><sub>Additive inverse means the sum of the values is 0, e.g. <sup>2</sup>/<sub>3</sub> + <sup>-2</sup>/<sub>3</sub> = 0 so <sup>-2</sup>/<sub>3</sub> is the additive inverse of <sup>2</sup>/<sub>3</sub>.</sub></sup> |
| `reciprocal()` &rarr; `Rational` | Returns a new rational number which is the multiplicative inverse of this value.<br />Throws an `IllegalArgumentException` if this value is 0 or the operation would cause integer overflow.<br /><sup><sub>Multiplicative inverse means the product of the values is 1, e.g. <sup>2</sup>/<sub>3</sub> * <sup>3</sup>/<sub>2</sub> = 1 so <sup>3</sup>/<sub>2</sub> is the multiplicative inverse of <sup>2</sup>/<sub>3</sub>.</sub></sup> |
| `plus(r: Rational)` &rarr; `Rational` | Returns a new rational number which is the sum of this value and `r`.<br />Throws an `IllegalArgumentException` if the operation would cause integer overflow. |
| `minus(r: Rational)` &rarr; `Rational` | Returns a new rational number which is the difference of this value and `r`.<br />Throws an `IllegalArgumentException` if the operation would cause integer overflow. |
| `times(r: Rational)` &rarr; `Rational` | Returns a new rational number which is the product of this value and `r`.<br />Throws an `IllegalArgumentException` if the operation would cause integer overflow. |
| `dividedBy(r: Rational)` &rarr; `Rational` | Returns a new rational number which is the quotient of this value and `r`.<br />Throws an `IllegalArgumentException` if `r` is 0 or the operation would cause integer overflow. |
| `raisedToThePowerOf(n: integer)` &rarr; `Rational` | Returns a new rational number which is this value raised to the power of `n`.<br />Throws an `IllegalArgumentException` if this value is 0 and `n` is negative or the operation would cause integer overflow. |
| `equals(o: Object)` &rarr; `boolean` | Returns `true` if the values are equal, and `false` if not.<br /><sup><sub>Rationals are comparable only with Rationals and Numbers (see: `java.lang.Number`).<br/>A Rational value should be "equal" to a single-precision floating-point value if their difference is strictly less than 2<sup>-20</sup>.<br/>A Rational value should be "equal" to a double-precision floating-point value if their difference is strictly less than 2<sup>-40</sup>.</sub></sup>  |
| `greaterThan(n: Number)` &rarr; `boolean` | Returns `true` if this value is strictly greater than `n`.<br /><sup><sub>See also: `equals(Object)`.</sub></sup> |
| `greaterThan(r: Rational)` &rarr; `boolean` | Returns `true` if this value is strictly greater than `r`. |
| `lessThan(n: Number)` &rarr; `boolean` | Returns `true` if this value is strictly less than `n`.<br /><sup><sub>See also: `equals(Object)`.</sub></sup> |
| `lessThan(r: Rational)` &rarr; `boolean` | Returns `true` if this value is strictly less than `r`. |
| `isZero()` &rarr; `boolean` | Returns `true` if this value is canonical 0. |
| `isOne()` &rarr; `boolean` | Returns `true` if this value is canonical 1. |
| `isMinusOne()` &rarr; `boolean` | Returns `true` if this value is canonical -1. |
| `toString()` &rarr; `String` | Returns the string representation of this value. Whole numbers are not represented as fractions, e.g. "7" not "7/1". |

`integer` means a 32-bit signed integer.

All operations on `Rational`s should have no side effects, i.e. should not modify the arguments or the object that recieves the call.

At this this point, we now know the methods and their signatures for every operation the user of the `Rational` class should be able to perform (and don't forget the `Number` and `Comparable<Number>` methods!).  There may be other methods we need or want to write, but this list is the list of all the methods that we *must* have.

<sup>*Note: I am 99% sure that **all** requirements are specified in this document or included by reference, e.g. the previous paragraph.  If you think you have discovered a requirement which is not explicitly stated here or in reference documentation, let me know.*</sup>

Now, it's time to think about measuring the functional correctness of these methods.  We will do this one function at a time, starting with what seems like the simplest and most fundamental operation: construction.

[next section: constructor correctness](constructor_correctness.md)

<hr>

[table of contents](toc.md)
