object MultipleChecker {

  def main(args: Array[String]): Unit = {
    // Ensure we have exactly one argument
    if (args.length != 1) {
      println("Please provide exactly one integer as input.")
      return
    }

    // Convert the input to an integer
    val number = args(0).toInt

    // Define lambda functions
    val isMultipleOfThree: Int => Boolean = _ % 3 == 0
    val isMultipleOfFive: Int => Boolean = _ % 5 == 0

    // Use pattern matching to determine the category
    val result = (isMultipleOfThree(number), isMultipleOfFive(number)) match {
      case (true, true) => "Multiple of Both Three and Five"
      case (true, false) => "Multiple of Three"
      case (false, true) => "Multiple of Five"
      case (false, false) => "Not a Multiple of Three or Five"
    }

    // Print the result
    println(result)
  }
}

