package collections

fun main() {

    val immutableMap = mapOf(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2020),
            3 to Car("silver", "Honda", 2016))

    println(immutableMap.javaClass) //LinkedHashMap

    val mutableMap = hashMapOf("Someone's Car" to Car("yellow", "Range Rover", 2010),
            "Someone else car" to Car("black", "Kia", 2021))

    println(mutableMap.javaClass) //HashMap

    val pair = Pair(10, "ten")

    val (firstValue, secondValue) = pair

    println(firstValue)
    println(secondValue)

    for (entry in mutableMap) {
        println(entry.key)
        println(entry.value)
    }

    val car = Car("brown", "Honda", 1999)
    val (color, model, year) = car
    println("color is $color, model is $model, year is $year")

    val car1 = Car1("grey", "Skoda", 2005)
    val (color1, model1, year1) = car1
    println("color is $color1, model is $model1, year is $year1")

}

class Car (val color: String, val model: String, val year : Int) {

    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
}

data class Car1(val color: String, val model: String, val year : Int)