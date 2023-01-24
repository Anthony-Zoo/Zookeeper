fun main() {
    var n: Int = readln().toInt()

    if (n % 2 == 0) {
        n += 2
    } else {
        n++
    }

    println(n)
}