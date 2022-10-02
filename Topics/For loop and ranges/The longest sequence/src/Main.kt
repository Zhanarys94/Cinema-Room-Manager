fun main() {
    val n = readln().toInt()
    var length = 1
    var maxlength = 1
    var first = readln().toInt()
    for (i in 1 until n) {
        val input = readln().toInt()
        if (first <= input) {
            ++length
            first = input
            if (maxlength < length) maxlength = length
        } else {
            length = 1
            first = input
        }
    }
    println(maxlength)
}