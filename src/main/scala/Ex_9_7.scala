/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_9_7 {

  object Companion {
    private def ma = {}
    def mb = {}

  }
// object compnation 의 private 이 아래 class에서 접근이 된다.
//  이건 동반객체라는 개념으로 이름이 같으면 접근할수 있는 스칼라만의 변태스런 특징
  class Companion {
    val a = Companion.ma
    val b = Companion.mb
  }

  def main(args: Array[String]): Unit = {

    val cc = new Companion
    println(cc.a)

  }

}
