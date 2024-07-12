object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide a single integer as input")
    } else {
      try {
        val input = args(0).toInt
        input match {
          case n if (n <= 0) => println("Negative/zero is input")
          case n if (n % 2 == 0) => println("Even number is given")
          case _ => println("Odd number is given")
        }
      } catch {
        case _: NumberFormatException => println("Please provide valid integer")
      }
    }
  }
}
