fun main(args: Array<String>) {
    exampleConditional()
}

fun exampleConditional() {
    val number: Int = 1
    val day: Int = 3

    if (number > 0 ) {
        println("Positive number")
    } else if (number < 0) {
        println("Negative number")
    } else {
        println("Number is zero")
    }

    when(day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }
}