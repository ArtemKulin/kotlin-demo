package files

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream

fun main() {

    val bin = DataInputStream(FileInputStream("src/files/testBinFile.bin"))
    var si: String

    try {
        while(true) {
            si = bin.readUTF()
            println(si)
        }
    } catch (_: EOFException) {
    }

}