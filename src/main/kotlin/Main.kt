fun main(args: Array<String>) {
    exampleCollection()
}

fun exampleCollection() {
    // Array Of
    val names = arrayOf("Ryan", "John", "Jane")
    for (name in names) println(name)

    // Array List
    var nameList = arrayListOf<String>()
    nameList.add("Cristiano")
    nameList.add("Mark")
    nameList.add("Elon")
    for (nameWithList in nameList) println(nameWithList)
}