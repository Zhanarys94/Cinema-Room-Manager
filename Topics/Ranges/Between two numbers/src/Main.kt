fun main() {
    val (a, b, c) = Array(3) { readln().toInt() }
    println(a in b..c)
}