/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */
object Ex_5_11 {

//  implicit 은 에러를 내지 않고 사용가능한 함수가 있으면 그것을 사용해서 암묵적으로 형변환을 한다는 의미이다.
  implicit def doubleToInt(d: Double) = d.toInt

//  하지만 반환 자료형과 매개변수로만 판단하기에 조금 거시기하다.
//  예를 들면 이런것..
//  아래 펑션 때문에 뭘 써야할지 몰라서 컴파일 에러가난다.
//  implicit def doublieToInt2(d: Double) = d.toInt


  def main(args: Array[String]): Unit = {
    val x: Int = 18.1
    println(x)
  }

}
