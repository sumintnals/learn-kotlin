// 이해 위한 용도. 바람직하지는 않은 모양암~
fun addTwoNumbers(number1 : Int, number2 : Int): Int {
    return number1 + number2
}

fun addTenNine(function: (Int, Int) -> Int) {
    var result : Int = function(10, 9)
    println("결과는 $result 입니다")
}

addTenNine(::addTwoNumbers)

// 람다
// 풀버전(생략이 없는 버전)
val addTenNine2 : (Int, Int) -> Int = { number1: Int, number2 : Int ->
//    var result = number1 + number2
//    result
    number1 + number2 // 마지막 라인이 리턴이 된다
}

addTenNine(addTenNine2) // 람다함수를 인자로 사용하는 경우에는 ::를 사용할 필요가 없다

val addTenNine3 : (Int, Int) -> Int = { number1, number2 -> // =를 기준으로 오른쪽의 변수 데이터 타입 생략 가능
    number1 + number2
}
addTenNine(addTenNine3)
val addTenNine4 = { number1 : Int, number2 : Int -> // =를 기준으로 왼쪽의 변수 데이터 타입 생략 가능
    number1 + number2
}

addTenNine(addTenNine4)

// 코틀린이 타입추론을 해주지만 익숙해지기 전까지는 원래 정석대로 작성하자!

// 너무 간단한 경우
addTenNine{number1, number2 -> number1 + number2}

// 파라미터가 없는 람다 함수
val addTenNine5: () -> Int = {
    10 + 9
}

// 파라미터가 한 개인 경우에는 it을 사용한다
val addTenNine6 : (Int) -> Int = {
    10 + 9
}

// 개념이 어려워요