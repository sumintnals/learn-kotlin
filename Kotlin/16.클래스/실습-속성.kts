// getter/setter
class Book() {
    var title : String = "모름"
        get() {
            return field
        }
        set(value) { // 값을 설정할 때는 무엇으로 설정할 지 알아야 하기 때문에 value로 들어온다

        }
    var subtitle : String = "몰루"
        get() {
            return field // 속성이 접근될 때 필드값 그대로를 반환하겠다.
        }
        set(value) {
            field = value // 필드(subtitle)에 들어온 값 할당
        }
}

var book = Book()
println(book.title) // get()호출 -> 책 제목
book.title = "제목 변경" // set()호춯

// 값에 직접 접근하는 것을 방지하기 위해 get, set을 사용하는 것으로 알고 있었는데...

class Book2() {
    lateinit var title : String
    var subtitle : String = "몰루"
        get() {
            return field // 속성이 접근될 때 필드값 그대로를 반환하겠다.
        }
        set(value) {
            field = value // 필드(subtitle)에 들어온 값 할당
        }
    fun nextPage() {
        if(::title.isInitialized) {
            println("페이지가 넘어간다")
        } else {
            println("초기화가 필요합니당")
        }

    }
}

val book2 = Book2()
println(book2.nextPage())
book2.title = "책이름"
println(book2.nextPage())

// Lazy
// - 호출시점에 by lazy 정의에 의해 초기화 수행
// - val에서만 사용이 가능하다
class BookLazy {
    val title: String by lazy {
        println("lazy 초기화")
        // 대충 엄청 복잡한 작업
        "책 제목"
    }
}

val book3 = BookLazy()
println(book3.title)

// 사용 빈도 - 많지는 않으나 사용을 한다
// lateinit - 초기화를 나중에 하겠다. 되어있을수도 안되어있을수도
// by lzay - 초기화를 느...............리..........게 초기화는 무조건 할건데 나중에 할거다.