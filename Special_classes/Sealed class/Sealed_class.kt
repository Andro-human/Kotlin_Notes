// A sealed modifier used in front of a class behaves just like abstract, but it also introduces some limitations.  
// A sealed modifier informs the developer that this class has a limited no. of subclasses known in advance during compilation
// Officially subclasses of a sealed class need to be defined in the same package.

sealed class Role
class CeoRole(): Role()
class ManagerRole(val name: String): Role()
class WorkerRole(val name: String): Role()

fun constructLabel(role: Role): String {
    return when (role) {                                        // no need to define else block as you cover s
        is CeoRole -> "The boss"                                // all possible subtypes of a sealed clas
        is ManagerRole -> "Manager ${role.name}"
        is WorkerRole -> role.name
    }
}

fun main() {
val label = constructLabel(ManagerRole("Leonard"))
println(label) // Manager Leonard
}