/**
  *
  * Created By iw.jhun
  * On 2018-05-18
  *
  */
object Ex_7_5 {

  def main(args: Array[String]): Unit = {

    val list3 = "a" :: "b" :: "c" ::Nil
    val list4 = 1 :: 2:: 3:: Nil
    val list5 = 2 :: 2:: 4:: Nil

    println(list3 ++ list4)

    println(list3 ++ list4 ++ list5)

    println((list3 ::: list4 ::: list5))

    println((list3 ::: list4 ::: list5).distinct)

    println(list5.exists(x => x >3))

    println(list4.mkString(","))

  }

}
