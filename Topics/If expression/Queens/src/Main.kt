import kotlin.math.*

fun main() {
    val (y1, x1) = readln().split(" ")
    val (y2, x2) = readln().split(" ")
    val y = abs(y2.toInt() - y1.toInt())
    val x = abs(x2.toInt() - x1.toInt())
    if (y == x || y == 0 || x == 0) {
        println("YES") 
    } else {
        println("NO")
    }
}
