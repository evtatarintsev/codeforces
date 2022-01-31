fun main() {
    val t = readInt()
    repeat(t) {
        val (n, initRam) = readInts()
        println(calcMaxRam(n, initRam, readInts(), readInts()))
    }
}

fun calcMaxRam(n: Int, initRam: Int, required: List<Int>, provide: List<Int>): Int {
    var ram = initRam
    val soft = required.zip(provide).sortedBy { (r, _) -> r }
    soft.forEach { (required, provide) ->
        if (required <= ram) {
            ram += provide
        } else {
            return ram
        }
    }
    return ram
}

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
