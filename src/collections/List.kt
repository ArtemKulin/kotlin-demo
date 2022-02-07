package collections

fun main() {

    val strings = listOf("Spring", "Autumn", "Winter", "Summer")
    println(strings.javaClass) //Immutable list

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val notNullList = listOfNotNull("str", null, "something")
    println(notNullList) //null is not printed

    val arrayList = arrayListOf(1, 2, 3)
    val mutableList = mutableListOf("string", "another string")
    println(arrayList.javaClass) //java.util.ArrayList
    println(mutableList.javaClass) //java.util.Arraylist


}