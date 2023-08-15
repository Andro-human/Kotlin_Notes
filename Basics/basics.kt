
fun main() {
    var a : Any = 10
    a = "string"
    println(a)


    // String conversion
    val text = "Some Text"

    println(text.uppercase()) // SOME TEXT

    println(text.lowercase()) // some text

    println(text.replace("Text", "NewText")) // Some NewText

    println("A B A C".replace("A", "G")) // // G B G C

    // Number conversion
    val i: Int = 10

    val l: Long = i.toLong()

    val f1: Float = i.toFloat()

    val f2: Float = l.toFloat()

    println(f1) // 10.0

    println(f2) // 10.0

    println("f1+f2 = ${f1+f2}")                    // string injection

    val myString = """  Hello
    This is a string
    It is on multiple line"""
    println(myString)

    // searching strings

    val string = "Hello"
    
    val startsWithHel = string.startsWith("Hel")            // true
    val endsWithLo = string.endsWith("lo")                  // true
    val firstchar = string.first()                              // H
    val lastchar = string.last()                                // o
    val equalsHello = string.equals("Hello")                           // true

}