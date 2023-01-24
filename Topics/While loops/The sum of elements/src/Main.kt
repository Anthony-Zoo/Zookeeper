fun main() {
    var sum: Int = 0
    do {
        val input: Int = readln().toInt()
        sum += input
    } while (input != 0)

    println(sum)
}