open class Drone() {
    open val look = "Black and white"   // By default, Kotlin classes are final – they can’t be inherited. 
                                        // To make a class inheritable, mark it with the open keyword 

    open fun setoff() {             // to modify attributes and methods, they must also be marked with open keyword 
        move(0.0, 10.0, 0.0)
    }

    open fun move(front : Double, up : Double, rotate : Double) {
        println ("Moving $front $up $rotate")
    }
                                    }

class SuperheroDrone() : Drone()                  // this is a class constructor call
                               {
    override val look : String = "Superhero look"       // override means modifying the value

    override fun setoff() {
        move(0.0, 15.0, 0.0)
    }

    override fun move(front : Double, up : Double, rotate : Double) {
        println("Superhero is moving")
        super.move(front, up, rotate)           // super keyword indicate that I am referencing a
                                                // func from the parent 
    } 

}

fun main() {
    val drone : Drone = SuperheroDrone()        // since it is also a drone
    println(drone.look)
    drone.setoff()
    drone.move(10.0, 0.0, 0.0)
}