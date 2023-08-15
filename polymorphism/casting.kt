interface Animal

class Dog(val name: String) : Animal {
    fun retrieve(item: String) {
        println("Retrieving $item")
    }
}

class Cat : Animal

fun play(animal: Animal) {
    if (animal is Dog) {
        animal.retrieve("stick")                // Smart-casting (since if condition satisfied animal converted to dog)
    } else {
        println("I do not know how to play with this animal")
    }
}

fun main() {
    play(Dog("Rex")) // Retrieving stick
    play(Cat()) // I do not know how to play with this ani

    var animal: Animal = Dog("Bruno")
    val dog: Dog = animal as Dog // Do that ONLY when you know an object is of the type you are casting to (as animal might be a cat)


    // Often smart-casting is used together with a when statement.
    when (animal) {
        is Dog -> animal.retrieve("stick")
        is Cat -> println("NON")
    }
}

