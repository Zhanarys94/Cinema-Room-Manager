fun main() {
    val nums = MutableList(readln().toInt()) { readln().toInt() }
    var triples = 0
    for (i in 0 until nums.size - 2) {
        if (nums[i] == nums[i + 1] - 1 && nums[i] == nums[i + 2] - 2) ++triples
    }
    println(triples)
}