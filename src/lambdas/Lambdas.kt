package lambdas

fun main() {

    val employees = listOf(Employee("Alex", "Wilson", 2001),
        Employee("Jane", "Simpson", 2004),
        Employee("Mary", "Smith", 2002),
        Employee("Kate", "Stanford", 2001)
    )

    //Can use it for iterable value
    println(employees.minByOrNull { it.year })

    var num = 10
    run {
        //Can change value in lambda
        num += 15
        println(num)
    }

    println(countToOnehundred())
    println(countAgain())
    println(countMore())

    findByEmployeeName(employees,"Wilson")
    findByEmployeeNameLambda(employees, "Wilson")

    "Some string".apply someString@ {
        "Another String".apply {
            println(lowercase())
            println(this@someString.uppercase())
        }
    }

}

fun countToOnehundred () : String {
    val nums = StringBuilder()
    for (i in 1..99) {
        nums.append("$i ")
    }
    nums.append(100)
    return nums.toString()
}

fun countAgain ()  =
    with(StringBuilder()) {
        for (i in 1..99) {
            append("$i ")
        }
        append(100)
        toString()
    }

fun countMore()  =
    StringBuilder().apply {
        for (i in 1..99) {
            append("$i ")
        }
        append(100)
    }.toString()

fun findByEmployeeName (employees : List<Employee>, lastname: String ) {
    for (employee in employees) {
        if (employee.lastname == lastname) {
            println("Find employee with ${employee.lastname}")
            return
        } else {
            println("there is no employee with lastname $lastname")
        }
    }
}

fun findByEmployeeNameLambda (employees : List<Employee>, lastname: String ) {
    employees.forEach returnBlock@ {
        if (it.lastname == lastname) {
            println("Find employee with ${it.lastname}")
            //return local
            return@returnBlock
        }
    }
    for (employee in employees) {
        if (employee.lastname == lastname) {
            println("Find employee with ${employee.lastname}")
        } else {
            println("there is no employee with lastname $lastname")
        }
    }
}

data class Employee(val firstName : String, val lastname : String, val year: Int )