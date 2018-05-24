/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_7_9 {

  def main(args: Array[String]): Unit = {
    val students = Map(
      1 -> "세은이",
      2 -> "정팔이",
      3 -> "정봉이"
    )

    val one = students.get(1)
    val three = students.get(3)
    val four = students.get(4)

    println(one)
    println(three)
    println(four)

    println(one.get)
    println(three.getOrElse("three 값이 없습니다."))
    println(four.getOrElse("four, 값이 없습니다"))


//    스칼라에는 시퀀스가 있다. 링크드리스트가 스칼라의 기본 리스트(index가 없는)이고, 시퀀스는 arraylist와 같다.(index가 있음))
  }

}
