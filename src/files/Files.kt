package files

import java.io.File

fun main() {
    val reader = File("src/files/testfile.txt").reader()
    val lines = reader.readLines()
    lines.forEach { println(it) }
    reader.close()

    //More Kotlin way

    val kLines = File("src/files/testfile.txt")
        .reader()
        .use { it.readText() }

    println(kLines)

    //Autocloseable extension function

    val cLines = File("src/files/testfile.txt").readText()
    cLines.forEach { println(it) }

    File("src/files/testfile.txt").reader()
        .forEachLine { println(it) }
}