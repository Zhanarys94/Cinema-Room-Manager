fun main() {
    val nums = MutableList(readln().toInt()) { readln().toInt() }
    val m = readln().toInt()
    var count = 0
    for (i in nums) {
        if (i == m) ++count
    }
    println(count)
}