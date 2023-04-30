object SingleTon {
    init {
        println("Singleton object created");
    }

    fun doSomething() {
        println("Doing something...");
    }
}

fun main(args: Array<String>) {
    SingleTon.doSomething()
}
