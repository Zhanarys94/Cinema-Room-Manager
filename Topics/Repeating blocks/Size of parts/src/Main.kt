fun main() {
    val n = readln().toInt()
    var p = 0
    var l = 0
    var s = 0
    repeat(n) {
        val input = readln().toInt()
        if (input == -1) {
            s++
        } else if (input == 0) {
            p++
        } else l++
    }
    println("$p $l $s")
}