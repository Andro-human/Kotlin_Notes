// Exception is an unwanted event that breaks the standard flow of your program

fun main() {
    try {
        val num : Int = "ABC".toInt()
        println(num)
    } catch (t: ArithmeticException) {            // it is called throwable since an exception is sometimes called a throw statement
        println("Caught ArithmeticException")
    }
    catch(t: NumberFormatException) {
        println("Caught $t")
        t.printStackTrace()                      // displays where the exception happened
    }
    catch(t: Throwable) {               //top of the hierarchy
        println("Caught")
    }

    println("Done")
}