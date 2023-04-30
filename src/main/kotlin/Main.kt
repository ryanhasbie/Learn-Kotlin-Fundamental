fun main(args: Array<String>) {
    sayHello()
}

fun sayHello() {
    // Variable cannot be reassigned (val)
    val name = "Ryan"

    // Error
    // name = "Hasbie"

    // Variable that can be reassigned
    // Mutable variable (var)
    var message = "first message"
    message = "This is message pass by reassign"

    println("Hello $name, $message")
}