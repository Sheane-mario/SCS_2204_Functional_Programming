

object patternMatching {

  def f(x: Int): String = x match {
    case x if (x <= 0) => "Negative/Zero"
    case x if (x % 2 == 0) => "Even"
    case _ => "Odd"
  }

  val pattMat = (f: Int => String, x: Int) => f(x)

  def main(args: Array[String]): Unit = {
    var num: Int = args(0).toInt

    println(pattMat(f, num))
  }
}
