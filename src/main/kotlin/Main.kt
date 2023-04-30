class Person (val name: String, val age: Int) {
    fun greeting() {
        println("Hello my name is $name")
    }
    // Run automation fun greeting use init
    init {
        greeting()
    }
}

fun main(args: Array<String>) {
    val person = Person("Ryan", 21)
    // No need to call
    // person.greeting()
    println("My age is ${person.age}")
}
