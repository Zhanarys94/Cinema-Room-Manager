fun main() {
    val a = readln().toInt().until(readln().toInt())
    var total: Long = 1
    for (i in a) {
        total *= i
    }
    println(total)
}
