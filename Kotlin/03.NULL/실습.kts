// nullable
val number : Int? = null

//non-null
//val number2 : Int = null
println(number) // null

val number2: Int? = 2+5
val number3: Int? = 10

/*
var number4: Int? = number2 + number3
-> 코드가 실행되는 시점에서 number2가 Int인지, null인지 알 수 없음
-> 연산 불가, 에러
 */


var number4: Int? = number2!! + number3!!
/*
!!로 null이 아님을 개발자가 보장할 수 있다
실제로 null인 경우 (NullPointException, NPE)발생
결론: 100% 확신할 수 없는 경우 사용하지 말자!!
 */

if (null == 5) { // == 비교연산은 가능하다

} else {
    // 항상 false
}
if (null == null) {
    // 항상 true -> 값을 비교한 것이 아닌 상태를 비교함
} else {

}


