fun main() {
    var n = readln().toInt()
    val sequence = mutableListOf<Int>(n)
    while (n != 1) {
        if (n % 2 != 0) {
            n = n * 3 + 1
            sequence.add(n)
        } else {
            n /= 2
            sequence.add(n)
        }
    }
    println(sequence.joinToString().replace(",", ""))
}