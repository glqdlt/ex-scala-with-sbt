/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */
object Ex_5_6 {

  def main(args: Array[String]): Unit = {

//    함수 표현식 3가지
    val g = f _
    val g2 : (Int => Int) = f
    println(f(1))
    println(g2(2))
  }

  def f(i : Int) = i

}
