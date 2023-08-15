// smart-casting is a Kotlin capability that can change the type of variable for a scope, 
// but only if Kotlin knows that the variable is of that type in the scope.


fun consume(a: Any) {
    if (a is String) {
        println(a.length) // the type of a is String
    }
    if (a is Int) {
        println(a * 10) // the type of a is Int
    }
    }
    
    fun main() {
    consume("ABC") // 3
    consume(10) // 100
    }