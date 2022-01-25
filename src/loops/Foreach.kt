package loops

fun main() {

    val seasons = arrayOf("spring", "summer", "autumn", "winter")
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value  -> println("$value is season number $index") }

    for (i in 0..5) {
        println("i = $i")
        for (k in 5..10) {
            println("k = $k")
            if (k == 7) {
                break
            }

        }
    }

}