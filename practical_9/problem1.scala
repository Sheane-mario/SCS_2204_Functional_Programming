

object interest {
  
  def rate(amount: Double): Double = amount match {
      case a if (a <= 20000) => 0.02
      case a if (a <= 200000) => 0.04
      case a if (a <= 2000000) => 0.035
      case _ => 0.065
  }
  val interest = (r: Double => Double, x: Double) => x * r(x)

  def main(args: Array[String]): Unit = {
    var amount: Double = 34000

    var c = interest(rate, amount)
    println(c)
  }
}
