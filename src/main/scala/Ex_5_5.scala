/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */


// 커링하고는 좀 다르다.
object Ex_5_5 {

  def go(thisYear: Int, str: String) = println(str + ":" + thisYear)

  def normalSum(x:Int, y:Int) = x + y

  def curriedSum(x:Int) (y:Int) = x + y

  def main(args: Array[String]): Unit = {
    val thisYear = 2016

//    인자 _ 와일드카드는 특별하다
    val fixedValueFunction = go(thisYear, _: String)

    fixedValueFunction("test1")
    fixedValueFunction("test2")
    fixedValueFunction("test3")

    println(curriedSum(1)(4))

    val csum1 = curriedSum(1)(_)
    println(csum1(5))
// _인자를 안 주면 에러가난다.
//    val csum2 = curriedSum(2)
//    println(csum2(5))

  }
}

