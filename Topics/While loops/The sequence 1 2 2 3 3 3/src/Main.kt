fun main() {
    val n = readln().toInt()
    var a = 1
    var b = 1
    while (a <= n) {
        repeat(b) {
            if (a <= n) {
                print("$b ")
            }
            a++
        }
        b++
    }
}