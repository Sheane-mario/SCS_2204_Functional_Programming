
object Employee {
  
  def normal(hours: Int): Int = 250 * hours
  def OT(hours: Int): Int = 85 * hours
  def tax(price: Int): Double = price * 0.12

  def takeHomeSalary(normalH: Int, OTH: Int): Double = normal(normalH) + OT(OTH) - tax(normal(normalH) + OT(OTH))

  def main(args: Array[String]): Unit = {
    println(takeHomeSalary(40, 30))
  }

}
