import java.lang.Exception

fun solution() {
    try {
        val (a, b) = List(2) { readln().toInt() }
        println(a / b)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("This is the end, my friend.")
    }
}