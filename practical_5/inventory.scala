object inventory {

  def getProductList(l: List[String]): List[String] = {
    val product = scala.io.StdIn.readLine("Enter product> ") 
    if (product != "done") {
      getProductList(l :+ product) 
    } else {
      l 
    }
  }

  def printProductList(products: List[String], len: Int): Unit = {
    if (len > 0) {
      printProductList(products, len - 1)
    }
    println(s"${len} ${products(len)}")
  }

  def getTotalProducts(products: List[String]): Int = products.length

  def main(args: Array[String]): Unit = {

    var products = List("")
    var productList = getProductList(products)
    var len = getTotalProducts(productList) 
    printProductList(productList, len - 1)

  }
}
