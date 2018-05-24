/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */
object Ex_7_8 {

  def main(args: Array[String]): Unit = {

    var basket: Set[String] = Set()
    basket += "딸기"
    basket += "포도"
    basket += "포도"
    basket += "사과"
    basket += "포도"
    basket += "딸기"
    basket += "바나나"
    basket += "딸기"


    println(basket)

    val someTuple = ("qwe", 123)
    val manyTuple = ("qweqwe", "eeee", 213, 326346346, 213123, someFunction)
    val notFuncTuple = ("wqe",213,"ee",33)

    println(someTuple)
    println(someTuple _1)
    println(someTuple._1)
    println(someTuple.swap)
    println(someTuple _1)

    println(manyTuple)

//     함수를 반환
    println(manyTuple _6)
//    함수가 있어서 swap이 안된다.
//    println(manyTuple.swap)

//    swap하려고 하니 데이터가 2개 초과하여서 되질않는다.
//    println(notFuncTuple.swap)
  }

  def someFunction: Int = {
    1
  }

}
