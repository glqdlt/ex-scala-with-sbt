/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */
object Ex_5_3 {
  def main(args: Array[String]): Unit = {
    dropship(people(9))
  }

  def people(n: Int): Int ={
    println(" people pull .. ")
    n
  }

//  이방법은 내가 익숙한 people() -> dropship() 의 순서로 실행된다.
//  이를 CALL-BY-VALUE 라고 한다.

//  def dropship(n: Int) = {
//    println("Setting.. dropship.. ")
//    println(n + "'s pull!")
//  }


//  그런데 이 경우는  dropship이 그냥 사람을 태우러 왔을 떄에는, 인자 9 명이 모여야만 태우고 갈수 있기 때문에
//   dropship 이 그냥 태우러ㅏ 왔을 때는 안된다. 이건 좀 모순이다. 이런 경웅에는
//  call-by-name 로 처리한다.
// 아래의 수정된 dropship() 을 호출하면 dropship() -> dropship() -> people() -> dropship() 이 된다.
  def dropship(n: => Int) = {
    println("Settings.. Dropship")
    println(n + " 's pull")
  }

}
