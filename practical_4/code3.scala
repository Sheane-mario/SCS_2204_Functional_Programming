object StringFormatter {
  // Method to convert a string to upper case
  def toUpper(str: String): String = str.toUpperCase

  // Method to convert a string to lower case
  def toLower(str: String): String = str.toLowerCase

  // Method to format the name using a provided function
  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    // Test inputs
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    // Applying the formatting functions to the test inputs
    println(formatNames(name1)(toUpper))  // BENNY
    println(formatNames(name2)(str => toUpper(str.substring(0, 2)) + str.substring(2)))  // NIroshan
    println(formatNames(name3)(toLower))  // saman
    println(formatNames(name4)(str => toUpper(str.substring(0, 1)) + toLower(str.substring(str.length - 1)) + str.substring(1, str.length - 1)))  // KumarA
  }
}

