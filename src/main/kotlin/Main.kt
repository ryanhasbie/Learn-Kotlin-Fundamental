fun main(args: Array<String>) {
   val persons = arrayOf(
       Person("Ryan", 21),
       Person("John", 31),
       Person("Jane", 22)
   )
   for (person in persons) println(person)
}

data class Person (val name:String, val age:Int)