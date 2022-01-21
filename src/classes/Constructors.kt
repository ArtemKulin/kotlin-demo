package classes

fun main() {

    val emp = Employee("Name")

    val emp1 = Employer("another", true)

    val demo = Demo("opt", "option")

    println(demo.option)
    demo.option = "setter"
    println(demo.option)
    demo.option = "other"
    println(demo.option)
}


//This is primary constructor
class Employee constructor(name : String) {

    private val name : String

    //initializer block
    init {
        this.name = name
    }
}

//Declaring parameter in constructor
class Employer (val name : String) {

    var fullTime : Boolean = true

    //Secondary constructor should call primary constructor
    constructor(name : String, fullTime : Boolean) : this(name) {
        this.fullTime = fullTime
    }
}

//Default value in primary constructor
class Worker (val name : String, var fullTime : Boolean = true)

//Custom getter and setter
class Demo (option: String, val anotherOption: String) {
    var option = option
    get() {
        return "Custom getter with value $field"
    }
    set(value) {
        field = "Custom setter with new value - $value"
    }

}