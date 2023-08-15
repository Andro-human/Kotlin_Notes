data class Student(
    val fullName: String,
    var grade: Double,
    val id: Int,
) 

fun getStudentById(id: Int): Student {
    return student.find{it.id == id} !!
}

fun searchInStudents(name: String): Student? {
    return student.find{it.fullName.lowercase() == name.lowercase()}
}

val student = listOf<Student>(Student("John", 140.0, 223), 
                Student("Mark", 120.0, 223), Student("Natali", 150.0, 342), 
                Student("Sara", 130.0, 781) )

fun main() {
    println("Please, Enter the ID of the student")
    val id: Int = readLine()!!.toInt()
    println(getStudentById(id))

    println("Please, Enter the student's name")
    val name: String = readln()
    println(searchInStudents(name)?: "The student is not found")
}
