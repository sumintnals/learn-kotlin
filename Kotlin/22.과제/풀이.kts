open class Warrior constructor(hp: Int, var power: Int, var armor: Int) {
    var hp: Int = 100
        set(value) { // hp 변경될 때마다 isAlive 접근
            if (value <=0) {
                field = 0
                this.isAlive = false
            } else field = value
        }
    init {
        this.hp = hp
    }
    var killCount: Int = 0
    var isAlive: Boolean = true
        get() {
            if (field == true) println("Warrior 아직 살아있다. 체력: ${this.hp}")
            else println("Warrior는 죽었습니다.")
            return field
        }

    open fun attack(monster: Monster) {
        println("Warrior가 공격을 합니다")
        if(!monster.defense(this)){
            // 몬스터 죽음
            this.killCount +=1
            println("몬스터 처치. 현재 킬 카운트: ${this.killCount}")
        }
    }
    fun defense(monster: Monster): Boolean {
        val damage: Int = monster.power - this.armor
        this.hp =- if(damage>0) damage else 0
        return this.isAlive
    }
    fun levelUp(): Knight? {
        if (this.killCount > 5) {
            println("Knight로 레벨 업!")
            return Knight(this) // warrior의 전체가 넘어감
        } else {
            println("레벨업 불가. 부족한 킬 카운트 ${this.killCount}")
            return null
        }
    }
}
class Knight constructor(warrior: Warrior): Warrior(warrior.hp, warrior.power, warrior.armor) {
    var energy: Int = 0
    init {
        this.hp = warrior.hp
        this.power = warrior.power + 2
        this.armor = warrior.armor + 1
    }

    override fun attack(monster: Monster) {
        super.attack(monster)
        this.energy += 1
    }
    fun hardAttack(monster: Monster) {
        if (monster.isAlive && this.energy>=3){ // 좋지 않은 방법 -> 다른 클래스의 프로퍼티를 직접 변경하는 것보다는 함수 등으로 접근하는 것이 좋은 방법
            monster.hp =- this.power + 30
            this.energy =- 3
        } else println("에너지 부족. 현재 에너지: ${this.energy}")
    }
}

class Monster constructor(hp: Int, var power: Int, var armor: Int) {
    var hp: Int = 100
        set(value) { // hp 변경될 때마다 isAlive 접근
            if (value <=0) {
                field = 0
                this.isAlive = false
            } else field = value
        }

    var isAlive: Boolean = true
        get() {
            if (field == true) println("Monster는 아직 살아있다. 체력: ${this.hp}")
            else println("Monster는 죽었습니다.")
            return field
        }
    init {
        this.hp = hp
    }
    fun bite(warrior: Warrior) {
        println("Monster가 공격을 합니다")
    }
    fun defense(warrior: Warrior): Boolean {
        val damage: Int = warrior.power - this.armor
        this.hp =- if(damage>0) damage else 0
        return this.isAlive
    }
}

val warrior =  Warrior(100, 10, 10)
loop@ while(warrior.killCount < 10){
    val monster = Monster(15, 1, 1)
    while (monster.isAlive) {
        warrior.attack(monster)
        monster.bite(warrior)
        if(!warrior.isAlive) {
            break@loop // 레이블, 루프문에 이름 붙일 때 사용. -> 중첩문의 최상단을 아예 빠져나가고 싶을 때 유용
        }
    }
}
val night: Knight? = warrior.levelUp()!!

//추가로 할만한 것들
//1. Knight 클래스 활용
//2. Healer 클래스 생성 후 회복 또는 부활시키는 기능 추가