

object formatStr {
  
  val toUpper = (str: String) => str.toUpperCase
  val toLower = (str: String) => str.toLowerCase

  val formatter = (f: String => String, str: String) => f(str)

  def main(args: Array[String]): Unit = {
      var str = args(0)

      println(formatter(toUpper, str))
      println(formatter(toLower, str))
  }
}
