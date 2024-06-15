
object CircleCalculator {
  val pi = 3.142

  def areaCircle(r: Double): Double = pi * r * r

  def celToFaren(c: Double): Double = c*1.8 + 32

  def volSphere(r: Double): Double = (4/3)*pi*r*r*r

  def discount(price: Double): Double = price*0.4

  def shippingCost(x: Int): Double = {
    if (x <= 50) {
      x*3
    } else {
      50*3 + (x - 50)*0.75
    }
  }

  def totalCost(copies: Int): Double = 24.95*copies + shippingCost(copies)

  def easy(x: Int): Int = 8*x
  def tempo(x: Int): Int = 7*x
  
  def main(args: Array[String]): Unit = {
    println(areaCircle(5))
    println(celToFaren(35))
    println(volSphere(5))
    var tot = totalCost(60)
    println(tot - discount(tot))
    println(easy(2) + tempo(3) + easy(2))

  }
}




