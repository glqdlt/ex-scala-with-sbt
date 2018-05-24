/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_8_3 {

  def main(args: Array[String]): Unit = {

    val o = List(1, 2, 3, 4)

//     foldLeft는 자바의 sum과 비슷하다. foldLeft(x) 인자인 x값은 누적될 값이고 나는 처음에 0을 초기값으로 주어줬다.
//    i는  o[N] 이고, j는 o[N+1] 이다.
//    즉, i + j 해서
    val n = o.foldLeft(0)((i, j) => i + j)

    println(n)


  }

}
