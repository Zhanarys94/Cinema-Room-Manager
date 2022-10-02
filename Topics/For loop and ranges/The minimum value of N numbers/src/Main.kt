fun main() {
    val n = readln().toInt()
    var min = Int.MAX_VALUE
    repeat(n) {
        val num = readln().toInt()
        if (min > num) min = num
    }
    println(min)
}