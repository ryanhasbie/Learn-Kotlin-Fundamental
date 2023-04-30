class Car(private var speed: Int) {

    fun getSpeed(): Int {
        return speed
    }

    fun setSpeed(newSpeed: Int) {
        speed = newSpeed
    }
}

fun main(args: Array<String>) {
    val myCar = Car(50)
    println("Current speed: ${myCar.getSpeed()}") // Output: Current speed: 50

    myCar.setSpeed(80)
    println("New speed: ${myCar.getSpeed()}") // Output: New speed: 80

    // myCar.speed = 100 // Compile error: "Cannot access 'speed': it is private in 'Car'"
}
