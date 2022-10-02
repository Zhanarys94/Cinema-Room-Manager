fun main() {
    val (a, b, c) = Array(3) { readln().toInt() }
    print(a in b..c || a in c..b)
}