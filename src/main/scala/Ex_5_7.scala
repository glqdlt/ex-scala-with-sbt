/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */
object Ex_5_7 {

  def main(args: Array[String]): Unit = {


//    https://www.zerocho.com/category/Algorithm/post/584b979a580277001862f182
//    x * x 를 곱하는 형태
    println(calc(x => x * x, 2, 5))

    println(calc(x => x + x, 1, 100000))


  }

  def calc(f: Int => Int, start: Int, end: Int) = {

    def loop(index: Int, sum: Int): Int = {
      if (index > end) sum
      else loop(index + 1, f(index) + sum)
    }
    loop(start,0)
  }


}
