/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */
object Ex_6_3 {

  case class Person(name: String, age: Int, rank: String)

  def main(args: Array[String]): Unit = {
    val person1 = Person("멋남", 47, "부회장")
    val person2 = Person("쾌남", 73, "회장")
    val person3 = Person("솔로", 27, "사원")
    val person4 = Person("음음", 27, "사원")
    val person5 = Person("영감", 44, "사원")
    val person6 = Person("애기", 14, "사원")

    matchAndHi(person1)
    matchAndHi(person2)
    matchAndHi(person3)
    matchAndHi(person4)
    matchAndHi(person5)
    matchAndHi(person6)
    matchAndHi(Person("하하",44,"ㄸㄸ"))
  }

  def matchAndHi(person: Person): Unit = person match {
    case Person("멋남",47,"부회장") => println("부회장님 오셨습니다.")
    case Person("쾌남",_,_) => println("쾌남 입니까?")
    case Person(a,27,c) => println(a + "님 오셨습니다. 27살 "+c+" 입니다")
    case Person(name,age,"사원") =>
      if(age > 27) println("사원인데 나이가 많으시군요")
      else println("애기인가?")
    case _ => println("당신은 누구?")
  }

}
