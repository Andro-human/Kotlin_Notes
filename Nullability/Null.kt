// Null is a value that indicates "lack of value"
// Nullable types must be used explicitly


var name: String? = null            // you have a make a type nullable to accept null
var i: Int? = null                 // it is done by adding a question mark
var c: Char? = null                 


class User(
    val name: String?               // you can also make a class parameter nullable to have null inside their name
)
val user: User? = null              // the same can be implement with a class type

fun processUser(user: User?): User? {             // nullable types can also be used as parameters and result type
    return null 
}

fun main() {
    val user2 = User(name = null)
    var result: User? = processUser(user = null)

    c = 'h'                          // you can also assign normal values
    println(name?.length)           // safe call

    if (user != null) {
        println(user.name)              // smart casting
    }
    // println(user.name)

    println(user!!.name)                // not-null assertion (unsafe option as it throws an exception)

    val userWithDefault: User = user ?: User("underfined")              // elvis operator (provides a default value 
                                                                        // when the value could be null)
}
