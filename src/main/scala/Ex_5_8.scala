/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */
object Ex_5_8 {
  def main(args: Array[String]): Unit = {

    printlnStrings("ㅇㅁㄴㅇ","123","123@#")

  }

  def printlnStrings(args: String*) = {
    for (arg <- args) println(arg)
  }


}
