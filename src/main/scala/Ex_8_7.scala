/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_8_7 {
  def main(args: Array[String]): Unit = {

    val o = List(1, 2, 3, 4, 5, 6, 0)

    val n = o.drop(4)
//    dropWhile은 i< 3 을 index 순서로 계속 체크하다가 false로 떨어지는 순간 멈추어버린다. 그래서 맨 마지막 0 이 살아있는 것.
    val nn = o.dropWhile(i => i < 3)
//

    println(n)
    println(nn)

  }

}
