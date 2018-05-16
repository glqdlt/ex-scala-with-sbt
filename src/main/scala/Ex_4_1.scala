/**
  *
  * Created By iw.jhun
  * On 2018-05-16
  *
  */
object Ex_4_1 {

  def main(args: Array[String]): Unit = {
    val car = new Vehicle()
    val car2 = new Vehicle2

    //    voVehicle은 case 클래스이다.
    val car3 = voVehicle(5000, "cheap")

    //    자바에는 클래스이름과 객체 이름이 같으면 안되지만 스카라에는 동반객체라는 개념으로 가능이하다.
    val vehicle = voVehicle(7000, "some cheap")

    println(car3.hood)
    println(car3.price)

    printCar(car)

    println(car2.price)
    println(car2.hood)

    car.price = 5000
    car.hood = "wow"

    printCar(car)
    //    val 로 선언되어 불변임으로 컴파일 에러남.
    //    car2.hood = "errr"

    val someUser = new User("홍홍", 20, 'm')
    someUser.sayName

    val paidUser = new PaidUser("홍길동", 30, 'm',5000)
    paidUser.sayName
    paidUser.showMoney

    println("====")
    echoUser(someUser)
    echoUser(paidUser)


    val someAnimal : Animal = new Animal;
    someAnimal.fly
  }

  def printCar(car: Vehicle): Unit = {
    println(car.price)
    println(car.hood)
  }


  class Vehicle2() {
    val price: Int = 10000
    val hood: String = "expensive hood"
  }

  //  case 클래스는 롬복의 Data 어노테이션과 비슷하다고 생각하면된다. 그리고 new 키워드를 굳이 안써도 생성이 된다. VO처럼 생성되는 시점에서 불변 객체로 되는듯
  case class voVehicle(price: Int, hood: String)

  // 이건 자바스크립트의 객체와 비슷한 느낌.
  class User(name: String, age: Int, sex: Char) {
    val sayName: Unit = println("와따시노 나마에와 : " + name);
  }


  class PaidUser(name: String, age: Int, sex: Char, money: Int) extends User(name, age, sex) {
    val showMoney: Unit = println(money + "원이 있습니다.")
  }

  def echoUser(user : User): Unit ={
    println("ll")
//    user.sayName을 했는데 기대하던 와따시노 나마에와가 안나온다.. 이건 뭘까?
//    println을 찍어보니 함수를 뜻하는 () 이 나온다띠요옹
    user.sayName
  }


  class Animal extends Flying with Swimming {
    override def fly = println("override fly")
  }



}
