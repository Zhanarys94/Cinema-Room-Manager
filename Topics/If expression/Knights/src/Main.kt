import kotlin.math.*

fun main() {
    val (y1, x1) = readln().split(" ")
    val (y2, x2) = readln().split(" ")
    val y = abs(y2.toInt() - y1.toInt())
    val x = abs(x2.toInt() - x1.toInt())
    if (y == 1 && x == 2 || y == 2 && x == 1) {
        println("YES") 
    } else {
        println("NO")
    }
}
