/**
  *
  * Created By iw.jhun
  * On 2018-05-17
  *
  */
object Ex_6_3_2 {


  def main(args: Array[String]): Unit = {

    val number1 = "010-222-2222"
    val number2 = "119"
    val number3 = "포도먹은돼지"

    val numberList = List(number1, number2, number3)

    for (number <- numberList) {
      number match {
        case Emergency() => println("aaaaa")
        case Normal(number) => println("asdadasd => " + number)
        case _ => println("i don't know")
      }
    }


  }
}

object Emergency{

  def unapply(arg: String): Boolean = {
    if (arg.length == 3 && arg.forall(_.isDigit)) true
    else false
  }

}

object Normal {

  def unapply(arg: String): Option[Int] = {
    try {
      var o = arg.replaceAll("-", "")
      Some(arg.replaceAll("-", "").toInt)
    } catch {
      case _: Throwable => None
    }
  }
}

