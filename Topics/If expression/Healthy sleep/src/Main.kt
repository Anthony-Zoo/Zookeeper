fun main() {    
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val h: Int = readln().toInt()

    println(if (h < a) {
        "Deficiency"
    } else if (h > b) {
        "Excess"
    } else {
        "Normal"
    })
}