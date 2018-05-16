/**
  *
  * Created By iw.jhun
  * On 2018-05-14
  *
  */
object Ex_3_8 {


  def genericForFor(): Unit = {
    for (x <- 1 until 5) {
      for (y <- 1 until 5) {
        println(x + " * " + y + " = " + x * y)
      }
    }

  }

  def doubleForFor(): Unit = {
    for (x <- 1 until 5; y <- 1 until 5) {
      println(x + " * " + y + " = " + x * y)
    }
  }

  def main(args: Array[String]): Unit = {

    genericForFor()
    doubleForFor()

  }

}
