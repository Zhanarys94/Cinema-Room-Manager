fun main() {
    val n = readln().toInt()
    var b = Int.MIN_VALUE
    var rep = 0
    for (i in 1..n) {
        val num = readln().toInt()
        if (b < num) {
            b = num
            ++rep
        }
    }
    if (n == rep) println("YES") else println("NO")
}