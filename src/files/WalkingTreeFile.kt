package files

import java.io.File

fun main() {
    File("src").walkTopDown().forEach { println(it) }
    File("src/files/").walkBottomUp().forEach { println(it) }

    File("src").walkTopDown()
        .filter { it.name.endsWith(".kt") }
        .forEach { println(it) }
}