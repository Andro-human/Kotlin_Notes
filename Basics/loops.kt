fun main() {
    // for loop

    //traverse
    val letters = listof("A", "B", "c")
    for (letter in letters) {
        println("The next letter is $letter")
    }

    // closed range
    for (i in 1..5) {
        println(i)              // 1 2 3 4 5
    }

    // open range
    for (i in 1 until 5) {
        println(i)                  // 1 2 3 4
    }

    // 5 downTo 1  (5 4 3 2 1)
    // 1..5 step 2 (1 3 5)
    // 1 until 5 step 2 (5 3 1)
}