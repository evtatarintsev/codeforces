fun main() {
    val requestsCount = readInt()
    repeat(requestsCount) {
        val data = readLongs()
        println(calc(data[0], data[1], data[2], ))
    }
}

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readLongs() = readStrings().map { it.toLong() } // list of ints

fun calc(toRight: Long, toLeft: Long, jumpCount: Long): Long {
    val leftJumps = jumpCount.div(2)
    val rightJumps = leftJumps + jumpCount % 2
    return rightJumps * toRight - leftJumps * toLeft
}
