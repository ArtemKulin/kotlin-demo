package datatypes

fun main() {
    val myInt = 10
    val myLong = 100L
    val myByte : Byte = 15
    val myShort : Short = 217

    var number = 50L

    //To wide number need to use special methods
    number = myInt.toLong()
    number = myByte.toLong()

    //Can't assign numerical to chars
    val myCharInt = 65
    var char : Char = myCharInt.toChar()

    var float = 67.98f
    val double = 89.098
    float = double.toFloat()

}
