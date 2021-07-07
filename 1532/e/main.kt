// https://codeforces.com/contest/1532/problem/D

fun main() {
    readInt()
    println(makeTeam(readInts()))
}

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun makeTeam(ranks: List<Int>): Int {
    return ranks.sorted().chunked(2).sumOf{it -> (it[1] - it[0])}
}
