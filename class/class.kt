
class Employee (
    val name : String,                  // Constructor definition (no need to initialize)
    var position : String                       
) {
    
    var label : String = "$name ($position)"        // Needs to be initialized as it is inside the body

    fun changePos(position: String) {

        println("Changed position from ${this.position} to $position")

        this.position = position
    }
}

fun main() {

    val employee1 = Employee("Alex", "Employee") 

    println(employee1.name)
    employee1.changePos("Manager")    
    println(employee1.label)
}