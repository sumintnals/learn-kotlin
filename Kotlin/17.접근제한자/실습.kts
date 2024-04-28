// Scope
var number : Int = 1
fun changeNumber() {
    var internalNumber : Int = 2

    number = 20 //하위 스코프에서 상위 멤버에 접근할 수 있음
    var number : String = "재정의" // 상위와 하위의 같은 변수명은 상관이 없음
}
// 상위 스코프에서는 하위 스코프에 접근 불가
// internalNUmber = 30 -> 컴파일 에러

changeNumber()
println(number)

// 상위 -> 하위 불가능
// 하위 -> 상위 가능 -> 사실상 하위는  독립적

// 접근제한자 실습
class Numbers(private var number: Int = 10) {
    fun chaneNumber() {
        this.number = 100 // Numbers라는 범위 안에 존재하기 때문에 number에 접근/변경 가능
    }
    fun whatIsNumber() : Int {
        return this.number
    }
}
var numbers = Numbers()
//println(numbers.numbers)

// numbers.number = 100 -> Numbers 밖에 존재하고 있기 때문에 number에 접근/변경할 수 없다.
// 메소드를 통해 간접적으로 접근

//public -> 내가 포함되어있는 범위 밖에서도 접근/변경 가능
//private -> 내가 포함되어있는 범위 밖에서는 접근/변경 불가능
// -> 내가 포함되어있는 범위 밖에서도 접근/변경 가능