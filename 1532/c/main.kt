// https://codeforces.com/contest/1532/problem/C

val chars = ('a'..'z').toList()

fun main() {
    val requestsCount = readInt()
    repeat(requestsCount) {
        val data = readInts()
        println(makeString(data[0], data[1]))
    }
}

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun makeString(length: Int, charsCount: Int): String {
    var result = ""
    var currentChar = 0
    for (i in 1..length) {
        result += chars[currentChar]
        currentChar++
        if (currentChar > charsCount-1) {
            currentChar = 0
        }
    }
    return result
}
