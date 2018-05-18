/**
  *
  * Created By iw.jhun
  * On 2018-05-18
  *
  */
object Ex_7_3 {

  def main(args: Array[String]): Unit = {
    val list_2: List[Int] = Nil
    //    val list2: List[Int = List() 와 동일


    val list_1 = "a" :: "b" :: "c" :: Nil

    for(x <- 0 until list_1.size)
      println(list_1(x))

    val list_3 = "d" :: "e" :: Nil

    val list_sum = list_1 ::: list_3


    //    for ( x <- 0 until list_sum.size)
    for ( x <- list_sum.indices)
      print(list_sum(x))

    println()

    println(list_sum.max)



  }

}
