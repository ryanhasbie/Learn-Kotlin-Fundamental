interface MathOperation {
    fun performOperation(a:Double, b:Double) : Double
}

class Addition : MathOperation {
    override fun performOperation(a: Double, b: Double) :Double {
        return a + b
    }

}

fun main(args: Array<String>) {
    val addition1 = Addition()
    val result = addition1.performOperation(12.0, 12.0)
    println(result)
}
