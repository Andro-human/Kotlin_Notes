fun main() {
    val pair = Pair(1.0, 'A')
    println(pair.first) // 1.0
    println(pair.second) // A
    val (number, letter) = pair
        // the type of number is Double
        // the type of letter is Char
    println(number) // 1.0
    println(letter) // A

    val pair2 = "Jay" to 18
    println(pair2.first)
    println(pair2.second)
}