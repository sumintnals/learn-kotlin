// 변수를 자료형과 함께 선언
// -> val/var 변수명 : 타입 = 값


// 정수형
val byteInt : Byte = 10
val shortInt : Short = 10
val integerInt : Int = 10
val longInt : Long = 10
// var wrongByte : Byte = 10000 => 컴파일 에러 (바이트의 표현 범위보다 더 큰 수 할당)
// var wrongByte : Byte = "10" => 타입 미스매치 에러 발생


// 실수형
// var floatNumber : Float = 10.0 => 에러 - float 타입과 맞지 않음
val floatNumber : Float = 10.0f // Float 경우 뒤에 f
val doubleNumber : Double = 10.0
// var doubleNumber : Double = 10 점을 찍어서 실수형임을 나타내야 한다. 까다롭구만


// 타입 추론
val number1 = 10 // Int
val number2 = 10.0 // Float


// 논리형
val yes: Boolean = true
val no: Boolean = false


// 문자형
val text1: Char = 'A'
// var text1: Char = 'AA' -> 에러. Char형은 문자가 반드시 하나만 들어가야 한다
// var text1: Char = "A" -> 타입 미스매치 에러


// 문자열
val text4: String = "안녕"
val text5: String = "A"


/*
팁: 자료형을 선택할 때는 최소한 작은 자료형을 고르는 것이 좋다.
그러나 개발하는 경우 그냥 Int, Double을 사용하는 경우가 많다!
 */

// 변수명 -> 키워드는 불가하다. 이미 코틀린이 선점했다~ var var(X)