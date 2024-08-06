
object EvenFilter {

  def evenFilter(nums: List[Int]): List[Int] = {
      nums.filter(num => num % 2 == 0)
  }
  def calculateSquare(nums: List[Int]): List[Int] = {
    nums.map(num => num * num)
  }
  def isPrime(x: Int): Boolean = {
     if (x == 1) false
     if (x == 2) true
     if (x % 2 == 0) false

     for (i <- 3 to x by 2 if i * i < x) {
        if (x % i == 0) return false 
     }
     true
  }
  def filterPrimes(nums: List[Int]): List[Int] = {
    nums.filter(num => isPrime(num))
  }
  def main(args: Array[String]): Unit = {
      val nums = List(1, 2, 3, 4 ,5, 6, 7, 8, 9, 10) 
      val fNums = evenFilter(nums)
      val sNums = calculateSquare(nums)
      val primeNums = filterPrimes(nums) 
      println(fNums)
      println(sNums)
      println(primeNums)
      println(isPrime(107))
      
  }
}
