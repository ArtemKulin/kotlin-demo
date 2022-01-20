package datatypes

fun main() {

    val strings = arrayOf("str1", "str2", "str3")

    val evenNumbers = Array(16) { it -> it * 2}

    for (number in evenNumbers) {
        println(number)
    }

    val zeros = Array(100) { 0 }

    val mixedArray = arrayOf("String", 'c', 232, 32L, 4545.3433f, 23.34)
    println("Is mixed array is Any ? : ${mixedArray is Any}")

    val intArr = intArrayOf(323, 434, 65)

    val anotherIntArr = IntArray(5)
}