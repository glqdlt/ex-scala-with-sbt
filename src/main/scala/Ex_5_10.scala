/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */
object Ex_5_10 {

  //  f(x) = x 라는 함수가 있다면 사실은, f.apply(x) 로 해석 할 수가 있다.
  //  apply 는 생략해왔지만 명시적으로 호출할 수 있다.
  def main(args: Array[String]): Unit = {

    val someThing = new SomeClass

//    아래 3개는 모두 같은 의미이다.
    println(someThing(2))
    println(someThing.apply(2))
    println(someThing.method(2))

  }

  class SomeClass {

    def mothod2(s: String) = s

    def method(m: Int) = m + m

    def apply(m: Int) = method(m)

  }

}
