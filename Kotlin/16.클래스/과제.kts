class Calculator1 constructor(num2 : Int, num1 : Int) {
    val num1 : Int
    val num2 : Int

    init {
        this.num1 = num1
        this.num2 = num2
    }

    fun add() {
        this.result(num2+num1)
    }
    fun sub() {
        this.result(num2-num1)
    }
    fun div() {
        this.result(num2/num1)
    }
    fun mul() {
        this.result(num2*num1)
    }
    fun result(result : Int) {
        println(result)
    }
}

var cal = Calculator1(1,3)
cal.add()
cal.sub()
cal.div()
cal.mul()

class Calculator2(num : Int) {
    var num : Int = 0

    init {
        this.num = num
    }
    fun calculate(operator : String, num2 : Int) {
        when(operator) {
            "+" -> {
                println(num+num2)
            }
            "-" -> {
                println(num - num2)
            }
            "/" -> {
                println(num / num2)
            }
            "*" -> {
                println(num * num2)
            }
            else -> {
                println("잘못된 연산입니다.")
            }
        }
    }
}
var cal2 = Calculator2(10)
cal2.calculate("*", 11)

// [연산자],[숫자] 형식으로 문제 해결
class Sol3 {
    var result : Int = 0

    fun calculate(operators: List<Char>, inputNumbers : List<Int>) {
        operators.forEachIndexed { index, op ->
            _calculate(op, inputNumbers[index])
        }
    }
    fun _calculate(operator : Char, inputNumber : Int) {
        when(operator) {
            '+' -> {
                this.result += inputNumber
            }
            '-' -> {
                this.result -= inputNumber
            }
            '/' -> {
                this.result /= inputNumber
            }
            '*' -> {
                this.result *= inputNumber
            }
            else -> {
                println("잘못된 연산입니다.")
            }
        }
    }
}

// [('+',10),('-',30)] 좋은 시도
// 그러나 실제 배열 원소의 타입은 Any로 나온다
// Any -> char로 변경해주는 과정이 추가로 필요하다
val solCal = Sol3()
solCal.calculate(listOf<Char>('+','*'),listOf<Int>(1,3))
println(solCal.result)