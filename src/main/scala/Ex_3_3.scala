/**
  *
  * Created By iw.jhun
  * On 2018-05-14
  *
  */
object Ex_3_3 {

  def genericFor() : Unit = {
    for(x <- 1 to 10)
      println("x의 값은" + x)
  }

//  Note : until은 마지막 10을 찍지 않는다. for와 가장 큰 차이.
  def untilFor() : Unit = {
    for(x <- 1  until  10)
      println("x의 값은" + x)
  }
  def main(args: Array[String]): Unit = {

    genericFor()
    untilFor()
  }
}
