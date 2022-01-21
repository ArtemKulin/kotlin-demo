package inheritance


//Everything in Kotlin public and final
//Can extends from open or abstract
//Data class can't be open or abstract
abstract class Printer (val modelName : String) {
    open fun printModel() = print("There is model name of this printer with modelName $modelName")
    abstract fun bestSalePrice() : Double
}

open class LazyPrinter (modelName: String, pages: Int) : Printer(modelName) {

    override fun printModel() = print("This is another model")

    override fun bestSalePrice(): Double = 111.23
}

class SpecialLazyPrinter(modelName: String) : LazyPrinter(modelName, pages = 56) {
    override fun printModel() = print("This is again another printer and it's a super lazy")
}


fun main() {
    val printer = LazyPrinter("HP", 60)
    printer.printModel()
    println(printer.bestSalePrice())

    val lazyPrinter = SpecialLazyPrinter("LAZY")
}

