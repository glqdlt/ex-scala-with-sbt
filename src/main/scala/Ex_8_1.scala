/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_8_1 {

  def main(args: Array[String]): Unit = {

    val o = List(1,2,3,4)
    println(o)

//    map 은 변경된 데이터를 담은 새로운 List 를 리턴한다.
    val n = o.map(i => i * 10)
    println(n)

//    foreach 는 그냥 아무것도 안하고 허공에 소비한다.

    println(o)

    o.foreach(i => i * 20)

    println(o)





  }

}
