//오버로딩
class Sum {
    fun sum(): Int {
        return 10
    }
    fun sum(number1: Int):Int {
        return number1 + 10
    }

    fun sum(number1 : Int, number2 : Int): Int {
        return number1 + number2
    }
}

val sum = Sum()
println(sum.sum(1,2))
println(sum.sum(1))