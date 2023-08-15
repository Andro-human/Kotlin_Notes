class User(val name: String)

fun main() {
    val set = setOf('A', 'B')
    println(set)                                            //[A, B]

    val ints: Set<Long> = setOf(1L, 2L, 3L)
    println(ints)                                           //[1, 2, 3]

    println(set + 'C')                                      // Elements can be added to a set
    println(set + setOf('B', 'C'))                          //[A, B, C] (Elements in a set are unique)
    println(setOf('Z') + set)                               //[Z, A, B]

    println(set.size)                                       // Displays number of element
    println(set.isEmpty())                                  // True if the set is empty

    val user = setOf(User("A"), User("A"))                  // Since regular classes are considered unique
    println(user)                                           // they are never considered duplicates
                                                             // however data classes are equal when they have same values
    
    println(set.contains('A'))                               // (true) checking if a set contains a certain element
    println('Z' in set)                                     
    println('A' !in set)                                    // checking if a set does not contain a certain element

    for (int in ints)                                       // iterating over a set
        print(int)          
    println()

    val mutable = mutableSetOf(5,6)                         // defininng mutable set
    mutable.add(7)
    mutable.remove(6)
    println(mutable)                                        // [5,7]
    
}