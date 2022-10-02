fun main() {
    val (a, b, c) = Array(3) { readln().toInt() }
    if (a >= 1 && b <= 0 && c <= 0) {
        print(true)
    } else if (a <= 0 && b >= 1 && c <= 0) {
        print(true)
    } else if (a <= 0 && b <= 0 && c >= 1) {
        print(true).
    } else {
        print(false)
    }
}