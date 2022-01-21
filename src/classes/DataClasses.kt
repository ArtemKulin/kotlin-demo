package classes

const val COLOR = "GREEN"
const val YEAR = 2014
const val MODEL = "BMW"

//data class under the hover has methods: equals, hashcode and toString
data class Car(var color : String = "RED", var year: Int, var model : String)


fun main() {
    var car = Car(COLOR, YEAR, MODEL)
    var car2 = Car(COLOR, YEAR, MODEL)
    val car3 = Car(model = MODEL, color = COLOR, year = YEAR)
    val car4 = Car(year = YEAR, model = MODEL)
    println(car == car2) //same as equals, e.g. car.equals(car2)
    println(car === car2)//check references

    val cars = arrayOf(car, car2, car3, car4)

    //For put arguments from array to vararg use spread operator - *
    printColors(*cars)

    //Also for unpack elements
    val arrOfCars = arrayOf(*cars, car4)
    for (car in arrOfCars) {
        println(car)
    }
}

fun printColors (vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}