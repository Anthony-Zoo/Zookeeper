fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line

    val seconds: Long = totalSeconds % 60
    val minutes: Long = totalSeconds / 60 % 60
    val hours: Long = totalSeconds / 3600 % 24

    println("$hours:$minutes:$seconds")
}