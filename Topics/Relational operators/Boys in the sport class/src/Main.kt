fun main() {
    val h1: Int = readln().toInt()
    val h2: Int = readln().toInt()
    val h3: Int = readln().toInt()

    println((h1 <= h2 && h2 <= h3) || (h1 >= h2 && h2 >= h3))
}