fun main() {
    val n = readln().toInt()
    val income = MutableList(n) { readln().toInt() }
    val taxrate = MutableList(n) { readln().toInt() }
    val taxes = mutableListOf<Float>()
    for (index in income.indices) {
        taxes.add((income[index] * taxrate[index]).toFloat())
    }
    println(taxes.indexOf(taxes.maxOrNull()) + 1)
}