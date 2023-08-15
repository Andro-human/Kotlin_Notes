// Any class that extends Throwable can be used as an exception. That means it can be thrown using a throw block.
// Such an exception immediately ends functions unless it is caught with a try-catch block. 


class MyError: Throwable("Some message")

fun someFunction() {
    throw MyError()
    println("Will not be printed")
}

fun main() {
    try {
someFunction()
println("Will not be printed")
    } finally {
        println("Finally block was called")             // Finally block is invoked even if an exception occurs 
                                                        // (used to do operations that must always be done)
    }
//     catch (e: Throwable) {
// println("Caught $e") // Caught MyError: Some message
//     }
}