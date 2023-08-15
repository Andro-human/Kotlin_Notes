// Annotations are classes used to describe your code.
// An annotation by itself does absolutely nothing.  
// However, annotations are often defined by libraries that analyze your code and change its behavior based on an annotation.


annotation class MyAnnotation(val someDescription: String)

@MyAnnotation("Class annotation")
class A(
    @MyAnnotation("Constructor property annotation")        // describing the code using the class we created above
val a: Int
) {
    @MyAnnotation("Method annotation")
    fun b() {}
}

fun main() {
    val Anno : A = A(8)
    println(Anno.a)
}