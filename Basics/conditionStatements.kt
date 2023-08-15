fun main() {
    val x = true
    val tip = if(x) 10 else 0               // 10
    println(tip)

    val y = if (x) {
            println("Here you go")           // Here you go
            1                   // ignored
            5                   // ignored
            10
    } else {
        println("Sorry, I am broke")
        0
    }
    println(y)

    // when

    val password = "ABC"
    when {
        password == "" -> {
            println("Password cannot be empty")
        }
        password.length < 7 -> {
            println("This password is quite short")
        }
        else -> {
            println("This password is OK")
        }
    }

    val number = 1
    val text = when (number) {
        1 -> "Missed hit"
        in 2..5 -> "Hit with value $number"
        6 -> "critical hit"
        else -> "Unsupported value"
    }

    println(text)

    // type check
    val something: Any = "ABC"
    when (something) {
        is String -> println("This is String")
        is Int -> println("This is Int")
        is Double -> println("This is Double")
        is Boolean -> println("This is boolean")
    }

}