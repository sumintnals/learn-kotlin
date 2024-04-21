class FootballPlayer constructor(uniform : String, ball : String) {
    val uniform : String
    val ball : String

    init {
        this.uniform = uniform
        this.ball = ball
    }

    fun kick() {
        println("발로차~")
    }
    fun pass() {
        println("페스~")
    }
}

var footballPlayer = FootballPlayer("삘깅", "축구공")
footballPlayer.kick()
var footballPlayer2 =FootballPlayer("파랑", "축구공")
footballPlayer2.pass()
