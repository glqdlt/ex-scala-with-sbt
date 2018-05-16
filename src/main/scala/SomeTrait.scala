/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */

//파일이름은 Swimming 이다.. 근데 다중 trait이 된다. ㅋㅋㅋㅋ
// 파일이름을 바꿔야하는게 아닌가, action이라던지
trait Swimming {
  def swim = println("I swimming ~ ")
}

trait Flying{
  def fly = println("I can fly ~ ")
}

trait Running{
  def run = println("I runner ~ ")
}

trait Eating {
  def eat
}
