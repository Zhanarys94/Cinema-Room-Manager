fun main() {
    val (a, b) = Array(2) { readln().toInt()..readln().toInt() }
    val c = readln().toInt()
    println(c in a && c in b)
}