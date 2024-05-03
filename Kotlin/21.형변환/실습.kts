// 기본자료형 타입캐스팅
var number : Int = 10
var numberString : String = number.toString()
val stringToNumber : Int = numberString.toInt()
println(stringToNumber)

val numberF : Double = 10.5
val numberFString : String = numberF.toString()
val numberFInt : Int = numberF.toInt()

// to~ 함수 이용해 형변환

// 상속한 클래스간의 캐스팅
open class Warrior1(var name: String, var power: Int, var type : String) { // 부모클래스, 슈퍼클래스
     open fun attack() {
         println("복잡한 코드 + 공격")
     }
}

class DefenseWarrior1 constructor(name: String, power: Int) : Warrior1(name, power, "고블린") {
    fun defense() {
        println("방어")
    }
}

// is
// - 타입 체크
// - true, false 리턴
// - 스마트 캐스팅을 해준다
// 업캐스팅 - 자식 클래스 멤버 접근 불가
// - var은 불가능
val warrior : Warrior1 =  DefenseWarrior1("방어형 전사", 100) // var 선언 불가! if문 실행했을 때 warrior의 상태를 알 수 없기 때문
// warrior.defense() 불가! defense기능을 포기하고 warrior타입이 되었기 때문
if (warrior is DefenseWarrior1) {
    print("Y")
    // 스마트캐스팅
    // 내기 민든 집에서모두함께노래를합시다 warrior를 if문 안에서는 defenseWarrior1로 사용하게 해줌
    warrior.defense()
}

// as
// - 지정한 타입으로 캐스팅을 시도하고, 불가능한 경우 예외 발생
val warrior2 : DefenseWarrior1 = warrior as DefenseWarrior1 // 캐스팅 불가능한 경우 예외 발생
warrior2.defense()

// as?