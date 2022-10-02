fun main() {
    var sum = 0
    for (i in 1..readln().toInt()) {
        val inp = readln().toInt()
        sum += inp
    }
    println(sum)
}