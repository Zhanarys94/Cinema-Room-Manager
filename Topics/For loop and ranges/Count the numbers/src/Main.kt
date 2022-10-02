fun main() {
    val range = readln().toInt()..readln().toInt()
    val n = readln().toInt()
    var b = 0
    for (i in range) {
        if (i % n == 0) ++b
    }
    println(b)
}