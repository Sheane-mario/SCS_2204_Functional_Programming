object Main {

  def attendees(tPrice: Double): Double = 120 + (15 - tPrice) / 5 * 20

  def expense(attendees: Double): Double = 500.0 + 3.0 * attendees

  def income(tPrice: Double): Double = tPrice * attendees(tPrice)

  def profit(income: Double, expense: Double): Double = income - expense

  def main(args: Array[String]): Unit = {

    var bestPrice = 5.0
    var maxProfit = Double.MinValue

    var i: Int = 0
    for (i <- 5 to 100 by 1) {
      val price = i.toDouble
      val currAttendees = attendees(i)
      val currExpense = expense(currAttendees)
      val currIncome = income(i)
      val currProfit = profit(currIncome, currExpense)

      if (currProfit > maxProfit) {
        bestPrice = i
        maxProfit = currProfit
      }
    }

    println(s"Profit: $maxProfit")
    println(s"Optimal ticket price: $bestPrice")
  }
}
