fun main() {
    val n = readln().toInt()
    var (a, b, c, d) = arrayOf(0, 0, 0, 0)
    repeat(n) {
        val n = readln().toInt()
        when (n) {
            5 -> a++
            4 -> b++
            3 -> c++
            2 -> d++
        }
    }
    print("$d $c $b $a")
}