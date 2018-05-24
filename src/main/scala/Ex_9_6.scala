/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_9_6 {

  object Object1 {
    private def ma = {}
    def mb = {}
  }

  object Object2 {
//    ma를 찾을수 없다 private으로 선언됬기 때문
//    val a = Object1.ma
    val b = Object1.mb
  }

  def main(args: Array[String]): Unit = {

    println(Object1.mb)
    println(Object2.b)

  }

}
