// 주석 작성하는 방법
// 주석 -> 사람만 보기 위해서 작성한다

// 1. var 변수 선언하기
var changeYes = 100
println(changeYes) // 100
/*
var change_yes
change_yes
=> 컴파일 에러 property must be initialized or be abstract
*/
changeYes = 200
println(changeYes) // 200

// 2. val 변수 선언하기
var CHANGE_NO = 100
println(CHANGE_NO)
// CHANGE_NO => 200 컴파일 에러