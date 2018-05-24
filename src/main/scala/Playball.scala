import scala.util.Random

/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Playball {

  def main(args: Array[String]): Unit = {

    val ran = Random.shuffle(0 to 9).drop(7)

    println(ran)
  }

}
