object Main extends App {
  // Variable Declarations and Initializations
  var a: Int = 2
  var b: Int = 3
  var c: Int = 4
  var d: Int = 5
  var k: Float = 4.3f
  var g: Float = 5.0f

  // Evaluate Expressions
  // a) println( - -b * a + c *d - -);
  println(-b * a + c * d)

  // b) println(a++);
  println(a)
  a += 1

  // c) println(–2 * ( g – k ) +c);
  println(-2 * (g - k) + c)

  // d) println (c=c++);
  println(c)
  c += 1

  // e) println (c=++c*a++);
  c += 1
  println(c * a)
  a += 1
}


