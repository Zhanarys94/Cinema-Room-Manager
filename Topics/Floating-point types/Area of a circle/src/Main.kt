import kotlin.math.pow

const val pi = 3.1415

fun main() {
    val radius = readln().toDouble()
    val area = pi * radius.pow(2)
    println(area)
}