fun main(args: Array<String>) {
    exampleLoop()
}

fun exampleLoop() {
    // For
    val names = arrayOf("Ryan", "John", "Jane")
    for (name in names) println(name)

    // While
    var x = 5
    while (x >= 1) {
        println(x)
        x--
    }

    // Do while
    do {
        println(x)
        x++
    } while (x <= 10)
}