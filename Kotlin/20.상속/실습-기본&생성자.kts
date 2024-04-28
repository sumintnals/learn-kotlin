class Warrior() {
    fun acttack() {
         println("복잡한 코드 + 공격")
    }

}
class DefenseWarrior() {
    fun acttack() {
        println("복잡한 코드 + 공격")
    }
    fun defense() {
        println("방어")
    }
}
class HardWarrior() {
    fun acttack() {
        println("복잡한 코드 + 공격")
    }
    fun hardAttack() {
        println("방어")
    }

}
// 상속 사용
open class Warrior1(var name : String, var power : Int, var type : String) {
    open fun attack(){
        println("공격")
    }
    open fun getDefensePower(): Int{
        return 10
    }
}
// 주 생성자가 수퍼클래스 생성 하는경우
class DefenseWarrior1(name: String, power : Int) : Warrior1(name, power, "고블린") { // Warrior를 만들어서 자식클래스의 독자적 기능과 합치겠다
    fun defense() {
        println("방어")
    }
    override fun attack() {
        super.attack() // 슈퍼 클래스의 attack 함수
        println("간단한 코드 + 공격")
    }

    override fun getDefensePower(): Int {
        var defaultWarriorDefensePower = super.getDefensePower()
        return defaultWarriorDefensePower + 5 // 부모클래스의 값이 바뀔 경우
    }
}

val defenseWarrior : DefenseWarrior1 = DefenseWarrior1("블린이", 12)
defenseWarrior.defense()
defenseWarrior.attack()

// 주 생성자가 없는 경우
class HardAttackWarrior1 : Warrior1 {
    var bonusPower : Int
    constructor(name: String, power: Int, bonusPower : Int) : super(name, power, "골렘") {
        this.bonusPower = bonusPower
    }

    fun hardAttack() {
        println("강하게 공격")
    }
}

val hardAttackWarrior : HardAttackWarrior1 = HardAttackWarrior1("골렘", 10, 5)
hardAttackWarrior.attack()
hardAttackWarrior.hardAttack()

// 상속 -> 수퍼 클래스 맨 앞에 open 키워드
// super를 통해 부모 클래스 접근
// override로 부모 메소드 재정의 가능, open 키워드 사용