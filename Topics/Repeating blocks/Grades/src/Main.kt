fun main() {
    val n: Int = readln().toInt()

    var dCount: Int = 0
    var cCount: Int = 0
    var bCount: Int = 0
    var aCount: Int = 0

    repeat(n) {
        val grade: Int = readln().toInt()

        if (grade == 2) {
            dCount++
        }
        if (grade == 3) {
            cCount++
        }
        if (grade == 4) {
            bCount++
        }
        if (grade == 5) {
            aCount++
        }
    }

    println("$dCount $cCount $bCount $aCount")
}