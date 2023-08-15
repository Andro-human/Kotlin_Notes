open class Dog(val name: String)

class Labrador(name: String) : Dog(name)    // Labrador does not define name property, but it does not need to 
                                            // - it is already defined by its parent

fun main() {
    val lab = Labrador("Coco")
    println(lab.name) // Coco
}