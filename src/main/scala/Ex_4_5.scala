/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */
object Ex_4_5 {
  def main(args: Array[String]): Unit = {
    val flyingWhale = new Animal
    flyingWhale.swim
    flyingWhale.fly

    val overrideAnimal = new Animal;

    overrideAnimal.fly
  }


}
