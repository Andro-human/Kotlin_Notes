fun main() {
    val shoppingList = listOf(
        "tomatoes",
        "Spaghetti",
        "Chicken"
    )

    println(shoppingList)
    println("The list is $shoppingList")

    for (element in shoppingList) {                                 // method to iterate over the list
        println(element)
    }

    println(shoppingList.size)                                      // displays number of element

    val newShoppingList = shoppingList - "Chicken" + "Tofu"         // creating a new list from the existing list 
    println(newShoppingList)                                        // (does not modify the original)     


    val list: List<Int> = listOf(1,2,3)
    println(list.isEmpty())

    println(list[0])                                                // tomatoes

    println(list.contains(1))                                       // true
    println(0 in list)          
    println(3 !in list)                                             // check if the list does not contain the element

    val mutable = mutableListOf("a", "b")                           // a list which can be modified
    mutable.add("c")                                                // adds an element to the existing list
    mutable.remove("b")                                             // removes an element from the existing list
    println(mutable)
}