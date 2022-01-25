package loops

fun main() {

    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCCCCC" in stringRange)
    println("ZZZZ" in stringRange)

    val backwardRange = 5 downTo 1
    println(5 in backwardRange)

    val stepRange = 3..15
    val stepFive = stepRange.step(5)
    val reversedRange = range.reversed()

    //For loop needs an iterator.
    //Can use step to increment or decrement value
    for (i in range step 2) {
        println("This is number: $i in $range range")
    }

    for (i in 20 downTo 10) {
        println("this is downTo is working with number $i")
    }

    for (i in 10 until 15) {
        println("this is until is working with number $i")
    }

    val str = "Something"
    for (c in str) {
        println("$c letter")
    }

}