/**
  *
  * Created By iw.jhun
  * On 2018-05-11
  *
  */
// object는 static한 인스턴스이다.
object MyModule {

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)
    go(n,1)
  }

  def main(args: Array[String]): Unit ={
    println(formatFactorial(9))
  }


}
