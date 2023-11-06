# Complete Specification
[back to my thoughts on the refined functional requirements](refined_functional_requirements_my_thoughts.md)

We sent our refined functional requirements to the client. The client reviewed the requirements (and, hopefully, thought a bit about what they need to do and how they want to do it) and replied with these final specifications:

`Rational` must extend `Number` and implement `Comparable<Number>`.

| method | description |
| ------ | ----------- |
| `Rational()` | Constructs the rational number <sup>0</sup>/<sub>1</sub>. |
| `Rational(a: integer)` | Constructs the rational number <sup>`a`</sup>/<sub>1</sub>. |
| `Rational(a, b: integers)` | Constructs the rational number <sup>`a`</sup>/<sub>`b`</sub> in canonical form.  Throws an IllegalArgumentException if `b` is 0.<br /><sup><sub>Canonical form means the negative sign, if there is one, belongs to the numerator and the fraction is irreducible, e.g. <sup>48</sup>/<sub>-72</sub> is reducible to <sup>-2</sup>/<sub>3</sub>, which is the canonical form.</sub></sup> |
| `Rational(r: Rational)` | Constructs a copy of the given `Rational`. |
| `numerator()` &rarr; `integer` | Returns the numerator of this value. |
| `denominator()` &rarr; `integer` | Returns the denominator of this value. |
| `opposite()` &rarr; `Rational` | Returns a new rational number which is the additive inverse of this value.<br /><sup><sub>Additive inverse means the sum of the values is 0, e.g. <sup>2</sup>/<sub>3</sub> + <sup>-2</sup>/<sub>3</sub> = 0 so <sup>-2</sup>/<sub>3</sub> is the additive inverse of <sup>2</sup>/<sub>3</sub>.</sub></sup> |
| `reciprocal()` &rarr; `Rational` | Returns a new rational number which is the multiplicative inverse of this value. Throws an IllegalArgumentException if this value is 0.<br /><sup><sub>Multiplicative inverse means the product of the values is 1, e.g. <sup>2</sup>/<sub>3</sub> * <sup>3</sup>/<sub>2</sub> = 1 so <sup>3</sup>/<sub>2</sub> is the multiplicative inverse of <sup>2</sup>/<sub>3</sub>.</sub></sup> |
| `plus(r: Rational)` &rarr; `Rational` | Returns a new rational number which is the sum of this value and `r`. |
| `minus(r: Rational)` &rarr; `Rational` | Returns a new rational number which is the difference of this value and `r`. |
| `times(r: Rational)` &rarr; `Rational` | Returns a new rational number which is the product of this value and `r`. |
| `dividedBy(r: Rational)` &rarr; `Rational` | Returns a new rational number which is the quotient of this value and `r`. Throws an IllegalArgumentException if `r` is 0. |
| `raisedToThePowerOf(n: integer)` &rarr; `Rational` | Returns a new rational number which is this values raised to the power of `n`.  Throws an IllegalArgumentException if this value is 0 and `n` is negative. |
| `equals(o: Object)` &rarr; `boolean` | Returns `true` if the values are equal, and `false` if not.<br /><sup><sub>Rationals are comparable only with Rationals and Numbers (see: `java.lang.Number`).</sub></sup>  |
| `greaterThan(n: Number)` &rarr; `boolean` | Returns `true` if this value is strictly greater than `n`. |
| `greaterThan(r: Rational)` &rarr; `boolean` | Returns `true` if this value is strictly greater than `n`. |
| `lessThan(n: Number)` &rarr; `boolean` | Returns `true` if this value is strictly less than `r`. |
| `lessThan(r: Rational)` &rarr; `boolean` | Returns `true` if this value is strictly less than `r`. |
| `isZero` &rarr; `boolean` | Returns `true` if this value is canonical 0. |
| `isOne` &rarr; `boolean` | Returns `true` if this value is canonical 1. |
| `isMinusOne` &rarr; `boolean` | Returns `true` if this value is canonical -1. |
| `toString()` &rarr; `String` | Returns the string representation of this value. Whole numbers are not represented as fractions, e.g. "7" not "7/1".  The negative sign, if there is one, goes in front of the number, e.g. "-1/7" not "1/-7".|

At this this point, we now know the methods and their signatures for every operation the user of the `Rational` class should be able to perform (and don't forget the `Comparable<Number>` methods!).  There may be other methods we need or want to write, but this list is the list of all the methods that we *must* have.

Now, it's time to think about measuring the functional correctness of these methods.  We will do this one function at a time, starting with what seems like the simplest and most fundamental operation: construction.

[next section: constructor correctness](constructor_correctness.md)

<hr>

[table of contents](toc.md)
