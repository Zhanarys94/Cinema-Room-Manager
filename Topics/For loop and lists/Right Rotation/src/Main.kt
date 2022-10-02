import java.util.*

fun main() {
    val list = MutableList(readln().toInt()) { readln().toInt() }
    Collections.rotate(list, readln().toInt())
    println(list.joinToString(" "))
}