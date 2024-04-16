// 1. 문자열 직접 전달하는 방법
println("안녕하세요")
// 2. 변수 출력하는 방법
var name = "이름"
var myName = "조승연"
println("내 $name 은 $myName 입니다")

var number1 = 10
var number2 = 100
println("$number1 + $number2 는 ${number1+number2}")

// 특수문자 출력 방법
println("\$")
// 이건 안되네 println("${$}")
println("${"myName"}")

//java에서는 더하기로 구간을 나눔
println("" + number1 + "더하기" + number2 + "는")

println(""+10) // -> 문자열+다른 타입 = 문자열
// println(10+"") -> 에러!!
