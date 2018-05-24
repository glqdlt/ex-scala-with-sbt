/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_9_4 {

  def main(args: Array[String]): Unit = {
    print("값을 입력 해주세요 : ")
    val input = scala.io.StdIn.readLine()

//    여기서 나오는 Right 와 left는 Either에서 쓰는 내용이다.
//    Either[String,Int] 로 되어있지 않은가? Left가 String 인거고, Right 가 Int이다.
//    Right(input.toInt)는 input을 Int로 변환 가능할 경우에만 result를 Right 자료형으로 담는 다는 것이  다.
//     만약 .toInt를 시도하는 데, 숫자형으로 변환이 안된다면 exception이 발생함으로 Lefㅅ에 담긴다.
// 아래 케이스는 String이나 Int라면 Right에 담기게 했다.
//    예외가 발생한다면 Left에 담기게될것이다.
//    이거를 isLeft(), isRight()로 확인가능하다.
    val result : Either[String, Int] =
      try{
          Right(input.toInt)
      }catch{
        case e : Exception => Left(input)
      }

    println(result.getClass)
    println(result.isRight)
    println(result.isLeft)
  }

}
