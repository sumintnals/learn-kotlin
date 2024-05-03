interface Tiger {
    fun bite()
    fun goToBox()
}

class BackDoSanTiger : Tiger {
    override fun bite() {
        println("문다")
    }
    override fun goToBox() {
        println("상자에 들어간다")
    }
}

val backDoSanTiger : BackDoSanTiger = BackDoSanTiger()
backDoSanTiger.goToBox()
backDoSanTiger.bite()

interface Person { // 생성자 필요 없다. 고로 객체도 안 만든다
    // 구현부 X
    var dress: String
    fun eat()
    fun sleep()

    fun work() {
        "일을 한다" // 기본적으로 구현 안해도 됨, but override 가능
    }
}

class Student: Person {
    override var dress: String
        get() {
            return "교복" // get()="교복"
        }
        set(value) {}

    final override fun eat() { // 해당 클래스의 자식 클래스에서 override 불가
        println("밥을 먹는다")
    }

    override fun sleep() {
        println("잠을 잔다")
    }
}

class Teacher: Person {
    override var dress: String
        get() {
            return "교복" // get()="교복"
        }
        set(value) {}

    override fun eat() {
        println("밥을 먹는다")
    }

    override fun sleep() {
        println("잠을 잔다")
    }
}
