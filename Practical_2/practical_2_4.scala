
object Main {
  
  def attendees(tPrice: Double): Double = 120 + (15 - tPrice)/5*20
  
  def expense(attendees: Int): Double = 500.0 + 3.0*attendees

  def income(tPrice: Double): Double = tPrice*attendees(tPrice) 

  def profit(income: Double, expense: Double): Double = income - expense 

  def main(args: Array[String]): Unit = {
    
  }

}
