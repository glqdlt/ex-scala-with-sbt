/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_8_2 {

  def main(args: Array[String]): Unit = {

    val o = List(1,2,3,4)

    val n = o.filter(i => i >= 3)

    val n2 = o.filter(i => i >= 3).map(i => i * 10)

    println(n)
    println(n2)
  }

}
