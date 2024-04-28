// 클래스 선언 방법
class Person {}

// 생성자
// 주생성자: 클래스 이름 옆에 괄호로 둘러싸인 코드
// 클래스를 통해서 객체를 만드는 데 필요한 재료들을 적어준다
// 재료이름(변수명) : 재료타입(변수타입)
// 반드시 한 개만 존재 가능
// constructor 생략 가능
// 주 생성자 (생략 X)
class User1 constructor(name : String) { // 클래스 네이밍은 대문자로 시작(프로퍼티, property)
    val userName: String

    init { // 클래스가 생성될때(클래스를 통해서 객체를 만들 때) 호출된다
        userName = name // 파라미터로 들어온 name이 클래스의 변수 userName에 저장됨 -> 초기화
    }
}

// 클래스를 호출하는 방법 -> 클래스를 통해서 객체를 만드는 방법
// 클래스를 호출 -> 인스턴스화(Instance)
val user = User1("홍길동")

// 주생성자 -> init을 생략하는 방법 -> 다른 곳에서 초기화
class User2 constructor(name: String) {
    var userName : String = name // init블록 없이 초기화
}

// 주생성자 -> constructor를 생략하는 방법
class User3 (name: String) { // 함수와 그 모양이 비슷해진다
    val userName : String = name
}

// 주생성자 -> 생략할 수 있는 모든 것을 생략하는 방법
class User3_5(val userName: String) {

} // 생성자 인에 초기화

// 주생성자 -> 기본값 적어줄 수 있다
class User4(name: String = "김아무개") {
    val userName: String = name
}

val user = User4()

// 생성자에서 받는 속성이 여러개인 경우
class User5 constructor(age : Int, name : String) {
    val age : Int
    val name : String

    init {
        this.age = age // this -> 클래스 자체를 의미
        this.name = name
    }
}

val user5 = User5(20, "홍길동")
// user5.age  -> user5의 age
// user5.name -> user5의 name
// user5.기능 -> user5의 기능
// .은 객체의 속성이나 기능을 사용할 때 사용

// 부생성자(Secondary Constructor)
// - 부생성자는 constructor 키워드 생략할 수 없다
// - 주생성자에는 객체를 만들기 위한 필수 조건이 있다면, 부생성자에는 객체를 만들기 위한 옵션
// - 부생성자는 주생성자에서 필요한 조건을 포함하고 있어야 함(파라미터 포함해야함
// - 부생성자는 주생성자에게 생성을 위임(객체 생성을 주생성자에기 위임)
class User6 constructor(name: String) { // 클래스 오른쪽에오는 생성자는 주생성자임을 알 수 있음
    var age : Int = 0
    val name : String

    init {
        this.name = name
    }

    // 부생성자는 클래스명 우측에 올 수 없음 -> 클래스의 본문에 있어야 함
    // 필수 조건 + a의 느낌.
    constructor(name: String, age : Int) : this(name) {
        this.age = age
    }
}
val user6 = User6(name = "가나다")
println(user6.name)
//val user6_2(
// 추가로 받은 인자를 세팅해줄때 프로퍼티 선언을 var로 적고 초기값을 넣어줘야 함

// 주생성자가 부생성자보다 실행이 먼저 됨

// 실행순서
// 부생성자 호출 ->부생성자 안에 있는 주생성자 호출 -> init블록 호출 -> 부생성자 본문 실행
// 클래스 속성에서 초기화를 시켜주지 않아도 되는 이유
// - 초기화블록에서 초기화를 보장해주기 때문 -> 클래스가 생성될 때 초기화 블록은 무조건 실행이 딤
// - 초기화블록에서 초기화되지 않는 속성은 먼저 초기화 해줘야 함
// - 초기화블록에 없는 프로퍼티는 var

class User7 { // 주생성자가 없음, 부생성자가 주생성자에게 생성 위임 X
    val age : Int
    val name : String

    constructor(age: Int, name : String) { // 부생성자 맞음!
        this.age = age
        this.name = name
    }
}

val user7 = User7(10, "가나다")
println(user7.name)

// 주생성자가 없으므로 위임 안해도 됨
// 주생성자는 코틀린이 자동으로 생성해줌
