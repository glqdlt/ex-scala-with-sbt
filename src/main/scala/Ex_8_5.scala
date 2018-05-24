/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_8_5 {

  def main(args: Array[String]): Unit = {


    val o = List(1,2,3,4)
    val oo = List(5,6,7,8)

//    두 개의 컬렉션을 하나로 묶는 다양한 방법

    val n = o.zip(oo)
    val n2 = o zip oo

//    zip() 연산과 ::: 는 다르다.
    val n3 = o ::: oo

//    zip은 컬렉션 내부의 데이터를 튜플로 묶어서 다시 컬렉션으로 만들고
//    ::: 은 우리가 기본적으로 생각하는 컬렉션의 데이터들을 다 묶은 새로운 List를 반환한다.

    println(n)
    println(n2)
    println(n3)



  }

}
