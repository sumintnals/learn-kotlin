// ?
val number : Int = 10 // Non-Nullable Int
val number: Int? = null // Nullable Int

// !!
val nullableNumberList: List<Int?> = listOf<Int?>(1,2,3,null,null)
val result: Int = 0
nullableNumberList.forEach {
//    result += it!! // 개발자 보장 강제 언래핑 -> 지양~
}
// 정말 필요한 경우에만 사용을 해야한다

// ?.
val text: String? = null
println(text?.length)
// println(text.length) -> NullPointExeption 발생해야함

// !!.
//println(text!!.length) // NullPointExeption

// as?
open class Warrior1(var name: String, var power: Int, var type : String) { // 부모클래스, 슈퍼클래스
    open fun attack() {
        println("복잡한 코드 + 공격")
    }
}
class DefenseWarrior1 constructor(name: String, power: Int) {
    fun defense() {
        println("방어")
    }
}
val defenseWarrior = DefenseWarrior1("",100)
val warrior = defenseWarrior as? Warrior1
println(warrior) // null -> 자식 클래스가 아니기 때문에 더이상 Warrior1로 캐스팅 불가능 -> as 사용 불가능(CastingClassException)

// ?: 엘비스 연산
val text2 : String = "123"
val nullText : String? = null

val len1 : Int = if (text2 != null) text2.length else 0
var len2 : Int = text2.length ?: 0 // len1과 len2는 동일한 기능
