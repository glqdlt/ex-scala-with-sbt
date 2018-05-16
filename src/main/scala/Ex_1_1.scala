/**
  *
  * Created By iw.jhun
  * On 2018-05-14
  *
  */
object Ex_1_1 {
  //  이것은 에러가 난다? 이유는 스칼라는 초기화된 값에 의해 타입 추론을 하기 땜에, 초기값이 없다면 컴파일 에러가 날 수 밖에 없다..
  //  꼭 써야한다면 null이나 None을 써야한다.
  //  var a
//  val f:Int

  var b= null
  var c= None
  val d = null
  val e = None


  def main(args: Array[String]): Unit = {

    val pig :Pig = new Pig

    pig.eat
    pig.shout
    pig.fly



  }

//  믹스인
  class Pig extends Animal with Flying with Eating{
    override def shout: Unit = println("Shout")

    override def eat: Unit = println("Eat Eat")

  }

  abstract class Animal {

    def shout
  }

}
