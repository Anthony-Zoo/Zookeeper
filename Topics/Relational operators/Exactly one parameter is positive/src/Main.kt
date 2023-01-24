fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val c: Int = readln().toInt()

    var is_positive: Int = 0

    if (a > 0) {
        is_positive++
    }

    if (b > 0) {
        is_positive++
    }

    if (c > 0) {
        is_positive++
    }

    println(is_positive == 1)
}