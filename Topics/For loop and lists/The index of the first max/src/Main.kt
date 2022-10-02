fun main() {
    val nums = MutableList(readln().toInt()) { readln().toInt() }
    var max = nums.maxOrNull()
    println(nums.indexOf(max))
}