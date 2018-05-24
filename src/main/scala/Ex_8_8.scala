/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_8_8 {

  def main(args: Array[String]): Unit = {

//    flatten 은 말그대로 중첩되고 꼬인 컬렉션을 하나로 flat하게 만들어준다.
    val o = List(List(1,2,3,4), List(5,6))
//    이건 에러가 난다, 이유는 컬렉션만 있는 게아니라 Int 1,2,3 도 있기 때문
//    val someO = List(List(1,2,3,4),List(5,6),List(1,2),1,2,3)
    val someO = List(List(1,2,3,4),List(5,6),List(1,2))
    val n = o.flatten

    println(n)

    println(someO)
    println(someO.flatten)
  }

}
