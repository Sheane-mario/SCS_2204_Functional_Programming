object StringFilter {
  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List("hello", "world", "Scala", "programming", "example", "filter")
    val resultList = filterLongStrings(inputList)
    println("Original List: " + inputList)
    println("Filtered List: " + resultList)
  }
}

