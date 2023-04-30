class Person (val name: String, val age: Int) {
    fun greeting() {
        println("Hello my name is $name")
    }
}

fun main(args: Array<String>) {
    val person = Person("Ryan", 21)
    person.greeting()
    println("My age is ${person.age}")
}
