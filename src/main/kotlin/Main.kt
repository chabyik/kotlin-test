open class Animal(var name: String, var age: Int, val type: String) {
    init {
        println("$type $name 이(가) 발견됐습니다!")
    }

    constructor(name: String, type: String): this(name, 1, type) {
        println("$type $name 이(가) 탄생했습니다!")
    }

    fun info() {
        println("이름: $name")
        println("나이: $age")
        println("종류: $type")
    }
}

class Dog(name: String, age: Int): Animal(name, age, "강아지") {
    fun bark(type: Int) {
        when (type) {
            1 -> println("멍멍")
            2 -> println("월월")
            3 -> println("왈왈")
            else -> println("올바르지 않은 타입입니다.")
        }
    }
}

class Cat(name: String, age: Int): Animal(name, age, "고양이") {
    fun meow(type: Int) {
        when (type) {
            1 -> println("야옹")
            2 -> println("먀옹")
            else -> println("올바르지 않은 타입입니다.")
        }
    }
}

fun main() {
    val bogShil = Dog("복실이", 3)
    val yeongHui = Cat("고영희", 2)
    val sans = Animal("샌즈", "해골")

    bogShil.info()
    println()

    yeongHui.info()
    println()

    sans.info()
    println()

    bogShil.bark(3)
    yeongHui.meow(2)
}