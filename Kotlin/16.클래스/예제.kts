
class Bank {
    fun save(account : Account, money : Int) { // 클래스도 하나의 타입이 될 수 있다
        if (money >= 0) {
            account.balance += money
        } else {
            println("마이너스 금액은 예금할 수 없습니다")
        }
    }
    fun widhdraw(account: Account, money : Int) {
        if(money <= account.checkBalnace()) {
            account.balance -= money
        } else {
            println("잔액이 부족합니다.      ")
        }
    }
}

class Account constructor(val initialBalance : Int = 0) {
    var balance : Int = 0

    init {
        this.balance = balance
    }
    fun checkBalnace(): Int {
       return balance
    }
}