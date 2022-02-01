package loops

//If is an expression!
fun main() {

    val someCondition = 50 < 92

    val num = if (someCondition) 50 else 92

    //Same expression as under this
    if (someCondition) {
        println("50")
    } else {
        println("92")
    }


}