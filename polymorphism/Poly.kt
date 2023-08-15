interface Animal {
    val breed : String      // it's only a defination so no need to assign value
    fun pet()               //  no need to specify the function too
}                            
        // by default all the methods are open in an interface
class Cat(
    val name : String,
    override val breed : String      // override informs the reader that the functions is specified by an interface
) : Animal {
    override fun pet() {
        println("MEOW")
    }
}

class Dog(
    val name : String,
    override val breed : String      // override informs the reader that the functions is specified by an interface
) : Animal {
    override fun pet() {
        println("Waff")
    }
}

fun pet(animal : Animal) {
    animal.pet()
    println(animal.breed)
}

fun main() {
    pet(Cat("Jake", "Munc"))
    pet((Dog("Cookie", "Border Collie")))
}