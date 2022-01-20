package nullrefferences

fun main() {

    val str: String? = null
    //str = "This is not null"
    str?.uppercase()

    //Elvis operator - ?: paste value or if value is null paste default value.
    val str1: String = str ?: "This is null"
    println(str1)

    var anything : Any = arrayOf(1, 2, 3, 5, 6)
    //Class cast exception without safety operator
    val str2 = anything as? String
    println(str2)

    val str3 : String? = "This is not null"
    if (str3 != null) {
        printSomething(str3)
    }

    //Easy way to paste nullable string variable to not null function
    str3?.let { printSomething(it) }

}

fun printSomething(str: String) = print(str)