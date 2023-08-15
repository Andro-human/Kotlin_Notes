// Better way to represent values
// it represents a set of possible values

fun pay(amount : Double, method: PaymentMethod): Boolean {
    return when(method) {                               // you do not need to specify an else block as you cover all the values
        PaymentMethod.CASH -> true                      // of the enum class
        PaymentMethod.CARD -> true
        PaymentMethod.CHECK -> true
    }
}

enum class PaymentMethod {
    CASH,
    CARD,
    CHECK
}

fun main() {
    val success = pay(100.00, PaymentMethod.CARD)
    println(success);

    println(PaymentMethod.CASH)                 //(CASH) Enums can be translated to string
    println(PaymentMethod.CHECK.ordinal)        // ordinal tells the position of an element in the enum class

    for(method in PaymentMethod.values())              // you can easily iterate over enum classes
        println("At ${method.ordinal} there is $method")

    val string1 = "CASH"
    val method : PaymentMethod = PaymentMethod.valueOf(string1)     // You can transform a string into payment method
    println(method)
    val string2 : String = method.name                                 // and vice versa
}