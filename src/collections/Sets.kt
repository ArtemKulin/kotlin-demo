package collections

fun main() {

    val setOfInt = setOf(10, 20, 30, 40, 50) //immutable, so can't change container
    println(setOfInt.plus(100))
    println(setOfInt.minus(20))
    println(setOfInt.average())
    println(setOfInt.drop(2)) //drop first N elements in set

    val mutableSetOfInt = mutableSetOf(10, 20, 30, 40, 50)
    mutableSetOfInt.add(200) //method works only in mutable set
    println(mutableSetOfInt)

    println("This is filter works: ${setOfInt.filter { it % 3 != 0 }}")

}

data class Bus (val color: String, val model: String, val year : Int)