/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_9_1 {

  def main(args: Array[String]): Unit = {

    val list = List(10, 20, 40, 55)

    def foreach(list: List[Int]): Int = {
      def add(list: List[Int], total: Int): Int = {
        list match {
          case List() => total
          case List(item) => total + item
          case head :: tail => add(tail, total + head)
        }
      }

      add(list, 0)
    }

    val spagetti = foreach(list)
    val fold = list.foldLeft(0)((x, y) => x + y)
    val sum = list.sum

    println(spagetti)
    println(fold)
    println(sum)

  }

}
