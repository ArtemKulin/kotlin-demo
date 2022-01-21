package classes

class Utils {

    fun upperFirstLetter (str : String) = str.substring(0, 1).uppercase() + str.substring(1)
}

fun String.upperFirstLetter() : String = substring(0, 1).uppercase() + substring(1)

fun main() {
    val upperFirstLetter = Utils().upperFirstLetter("lol")
    println(upperFirstLetter)
    val upperFirstLetter1 = "this is a test".upperFirstLetter()
    println(upperFirstLetter1)

}