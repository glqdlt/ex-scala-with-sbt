/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */
object DangerMixIn {

  def main(args: Array[String]): Unit = {
//   override 없이 바로 하려면 shoot 이 중첩이 되서 컴파일 에러가 난다.
//    그래서 아래 trait들을 override 해주어 봤다.
    val someRobot : Mazinga = new Mazinga

    println(someRobot.shoot)
    println(someRobot.bomb)

  }
}

class Mazinga extends Robot with Daepodong with M16

// 이거는 하나의 shoot 최종적으로 상속되는 shoot 만 날리고 싶을 경우
//abstract class Robot {
//  def shoot = "shoot Robot"
//}
//
//trait M16  extends  Robot{
//  override  def shoot = "m16666"
//}
//
//trait Daepodong extends  Robot{
//  override  def shoot = "dae po!"
//
//  def bomb = "pow"
//}

// 아래는 부모의 shoot 과 오버라이드를 같이 쏘고 싶을 경우
abstract class Robot {
  def shoot = "shoot Robot"
}

trait M16  extends  Robot{
  override  def shoot = super.shoot + "m16666"
}

trait Daepodong extends  Robot{
  override  def shoot = super.shoot + "dae po!"

  def bomb = "pow"
}

