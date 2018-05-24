/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_10_1 {

  def convertInputs(input : String) : Option[Seq[Int]] = {
    val REGEX = "([0-9])([0-9])([0-9])".r
    input match{
      case REGEX(n1,n2,n3) =>
        if (n1 != n2 && n2 != n3 && n1 != n3)
          Some(Seq(n1.toInt, n2.toInt, n3.toInt))
        else
          None
      case _ => None
    }
  }

  def main(args: Array[String]): Unit = {
    println(convertInputs("123"))
    println(convertInputs("q"))
  }

}
