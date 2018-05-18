/**
  *
  * Created By iw.jhun
  * On 2018-05-18
  *
  */

// 스칼라는 명사보단 동사 위주의 언어이다. 이거는 아래를 보자
object WowScalaDynamic {

  def main(args: Array[String]): Unit = {

    val chulsoo = new Chulsoo

//    보통 나같은 자바개발자들이 하는 표현식
    chulsoo.eat("김치")

//    스칼라가 동사 위주의 표현식이라고 하는 이유.. wow. 위와 같다.
    chulsoo eat "김치"

  }

  class Chulsoo {
    def eat(what: String): Unit = {
      println("냠냠 " + what)
    }
  }

}
