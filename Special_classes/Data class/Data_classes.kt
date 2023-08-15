// data modifier changes the behaviour of class changes


data class Dog (
    var name : String,
    var age : Int
) {
    var breed = "German"
}

fun main() {
    val dog1 = Dog("Bruno", 9)      //Dog@85ede7b
    val dog2 = Dog("Bruno", 9)      //Dog@5674cd4d
    println(dog1 == dog2)
    println(dog1)
    println(dog2)

    println(dog1.name)   //Bruno
    println(dog1.age)    //9

    val(name, age) = dog1        // Destructuring (based on the position of elements and it doesn't matter how those elements are named)
                                // first variable is associated with first property and second with second propertly
    println(name)
    println(age)

    val new_dog = dog1.copy(age = 2)        // copy function
    println(new_dog)                        // original dog doesn't change


}