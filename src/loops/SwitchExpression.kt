package loops

import java.util.*

fun main() {

    when (someNumber(150)) {
        100 -> println("100")
        200 -> println("200")
        300 -> println("300")
        else -> println("dont know")
    }

    val something : Any = someType(false)

    val expression = when (something) {
        is String -> println(something.uppercase())
        is Int -> println(something.div(5))
        is Boolean -> println(something.not())
        else -> println("something else")
    }

    println(expression)

}

fun someType(any : Any) = any

fun someNumber(num : Int) = num

