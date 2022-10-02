import kotlin.math.max

fun main() {
    val n = readln().toInt()
    var i = 0
    repeat(n) {
        val prev = if (readln().toInt() % 4 == 0) it else 0
        i = max(i, prev)
    }
    println(i)
}