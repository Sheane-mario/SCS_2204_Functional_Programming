import scala.io.StdIn

object StringReverse {

  var rStr: String = ""
  def stringReverse(str: String): String = {
      if (str.isEmpty) ""
      else stringReverse(str.tail) + str.head
  }

  def main(args: Array[String]): Unit = {
    val str = StdIn.readLine()
    val reversedStr = stringReverse(str)
    println(s"Reversed String: $reversedStr")
  }

}
