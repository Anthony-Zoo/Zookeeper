fun main() {
    val input: Int = readln().toInt()

    println(if (input < 0 ) {
            "negative"
        } else if (input > 0) {
            "positive"
        } else {
            "zero"
        }
    )
}