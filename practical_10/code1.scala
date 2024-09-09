object RationalNumbers {
  class Rational(num: Int, den: Int) {
    private val g = gcd(num.abs, den.abs)
    val numer: Int = num / g
    val denom: Int = den / g

    def neg: Rational = Rational(-numer, denom)
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    override def toString: String = s"$numer/$denom"
  }

  object Rational {
    def apply(num: Int, den: Int): Rational = new Rational(num, den)
  }

  def sub(r1: Rational, r2: Rational): Rational = {
    Rational(r1.numer * r2.denom - r2.numer * r1.denom, r1.denom * r2.denom)
  }

  def main(args: Array[String]): Unit = {
    val x = Rational(3, 4)
    val y = Rational(5, 8)
    val z = Rational(2, 7)
    val result = sub(sub(x, y), z)
    println(s"Result: $result") // Output: Result: 17/28
  }
}
