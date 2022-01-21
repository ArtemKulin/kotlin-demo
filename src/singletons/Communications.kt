package singletons

import java.time.Year

fun main() {
    println(Communications.getCopyrightine())
    println(Communications.getTagline())
    println(SomeClass.accessPrivateVar())

    val someClass = SomeClass.justAssignString("Some string")
    val someClass1 = SomeClass.upperOrLower("This is a string", true)

    println(someClass.SomeStr)
    println(someClass1.SomeStr)
}


object Communications {

    val year = Year.now().value

    fun getTagline () = "Our company rocks!"

    fun getCopyrightine () = "Copyright \u00a9 $year Our company. All rights reserved"
}

class SomeClass private constructor (val SomeStr : String) {

//    val someStr : String
//
//    constructor (string: String) {
//        this.someStr = string
//    }
//
//    constructor (string: String, bool: Boolean) {
//        return if (bool) this.someStr = string.uppercase()
//            else this.someStr = string.lowercase()
//    }

    companion object {
        private var privateVar = 6

        fun accessPrivateVar () = "I' am accessing $privateVar"

        fun justAssignString (str: String) = SomeClass(str)

        fun upperOrLower (str : String, bool : Boolean) : SomeClass {
            if (bool) return SomeClass(str.uppercase())
            else return  SomeClass(str.lowercase())
        }
    }
}