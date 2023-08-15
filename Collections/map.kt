fun main() {
    val capital = mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
    println(capital)

    val alphabet: Map<Char, Int> = mapOf(Pair('A', 1), Pair('B', 2))
    println(alphabet) // {A=1, B=2}

    val number: Int? = alphabet['A']            // Here number is nullable because 
    println(number)                             // if the key you asked for is not in the map, then null will be returned
    println(alphabet['&'])                // null

    val map1 = alphabet + ('C' to 3)             // creating new map using existing map
    println(map1)
    
    val map2 = map1 + ('C' to 3)            // Duplicate elements are not allowed
    println(map2)                       // same as map 1

    val map3 = map2 - 'B'                   // creating new map using map2 and removing key {b}
    println(map3)

    println('A' in alphabet)                    // checking if a map contains a key
    println(alphabet.size)                   // display the number of elements in map

    for (alpha in alphabet)                              // iterating over map
        println("${alpha.key} is for ${alpha.value}")

    for ((letter, num) in alphabet)                      // iterating by restructuring in a for loop
        println("$letter is for $num")

    val mutable: MutableMap<Char, String> = mutableMapOf('A' to "Alex", 'B' to "Bob")           // declaring a mutable map
    mutable.put('C', "Celina")                                                               // adding new association in the map
    mutable['D'] = "Daria"
    mutable.remove('B')                         // removing association in map
    println(mutable)
}