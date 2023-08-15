

fun b() {}                              // cannot use function a here

fun double(value:Int = 10): Int {                // : Int -> return type of function 
    return value*2                                                // func with default argument
}

fun func(text : String) = println(text)

fun triangleArea(width: Double = 10.0, height: Double = 20.0): Double = width*height/2          // if a function have a single line of code
                                                                                // instead of braces you can use the equality sugn

fun main() {
                            // cannot use function a here
    fun a() {
        println("A")
    }

    a()                 // can use function a here

    println(triangleArea(height = 40.0))           // named argument (width = 10.0, height = 40.0)
}