fun main() {
    val (a, b, c) = Array(3) { readln().toInt() }
    val ab = a + b == 20 || a + c == 20 || b + c == 20
    println(ab)
}
