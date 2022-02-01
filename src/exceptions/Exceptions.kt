package exceptions

import kotlin.NumberFormatException

fun main() {

    println(getNumber("12.8") ?: "I cant'...")
    println(getNumber("22.5") ?: throw IllegalArgumentException("Value isn't Int type"))

}

fun getNumber (str : String) : Int? {
    return try {
        Integer.parseInt(str)
    }
    catch (e: NumberFormatException) {
        null
    }
    finally {
        println("I don't know what is it")
        1 //can't evaluate expression
    }
}