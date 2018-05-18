/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */
//패턴 매칭은 강력한 분기문이라고 한다.
//switch 를 대체해서 사용도 가능.
object Ex_6_1 {

  def main(args: Array[String]): Unit = {
    println(matchFunction(100))
    println(matchFunction(1000))
    println(matchFunction(1000.5))
    println(matchFunction("qwe"))
  }

//   와 개쩐다
  def matchFunction(input : Any) : Any = input match{
    case 100 => "hundred"
    case "hundred" => 100
    case etcNumber : Int => "당신이 입력한 것 : "+etcNumber+" 이 입력값은 100이 아닌 Int형 정수입니다. 100만 가능"
    case _ => "기타"
  }
}

