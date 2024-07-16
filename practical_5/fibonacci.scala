object fibonacci {
  
  def fibonacci(n: Int): Int = n match {
    case n if (n == 0) => 0
    case n if (n == 1) => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }
  def fibSeq(n: Int): Unit = {
    if (n > 0) {
      fibSeq(n  - 1)
    }
    println(fibonacci(n))
  }
  def main(args: Array[String]): Unit = {
    fibSeq(10)
  }
}
