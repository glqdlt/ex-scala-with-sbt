/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_8_4 {

  def main(args: Array[String]): Unit = {
    val o = List(1,2,3,4)
    val n = o.partition(i => i <3)
//    partition은 하드에서 많이 보는 파티션이란 용어처럼 분리시켜주는 컬렉션의 메소드이다.
//    true or false 기준으로 2개의 컬렉션을 가진 튜플을 반환한다.
    println(n)

    println(n _1)
    println(n _2)
    println(n._1)
    println(n._2)
  }

}
