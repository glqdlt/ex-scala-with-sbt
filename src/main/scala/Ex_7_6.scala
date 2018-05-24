import Ex_7_6.map

/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_7_6 extends App {

  var map = Map(
    "number1" -> "aa",
    "number2" -> "bb",
    "number3" -> "cc",
    5 -> 6
  )


  printing(map)

  println(map("number1"))
  //  .get으로 가져오면 Optional 로 래핑되서 반환된다. 결국 null체크도 가능해짐
  println(map.get("number1"))
  println(map.apply("number1"))


  map += ("number5" -> "wqe")
  map -= "number3"

  printing(map)

  println(map.contains("number3"))


  def printing(map: Map[_, _]): Unit = {
    println(map.isEmpty)
    println(map.keys)
    println(map.values)
    println(map)
  }

}
