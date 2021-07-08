// https://codeforces.com/contest/1532/problem/E

fun main() {
    readInt()
    val list = readLongs()
    val result = findBeautiful(list)
    println(result.size)
    println(result.joinToString(" "))

}

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readLongs() = readStrings().map { it.toLong() } // list of ints

fun findBeautiful(input: List<Long>): List<Long> {
    val sum = input.sum()
    val list = input.mapIndexed { i, it -> Pair(it, i.toLong()) }.sortedBy { it.first }.toMutableList()
    val beautifuls = mutableListOf<Long>()

    for (i in 1..list.size-1) {
        val current = list[i - 1]
        if (list.last().first == sum - list.last().first - current.first) {
            beautifuls.add(current.second + 1)
        }
    }
    if (list.size > 2) {
        val penultimate = list[list.size - 2]
        if (penultimate.first == sum - list.last().first - penultimate.first) {
            beautifuls.add(list.last().second + 1)
        }
    }
    return beautifuls.toList()
}
