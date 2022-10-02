fun main() {
    val n = readln().toInt()
    val a = MutableList(n) { readln().toInt() }
    a.add(0, a[a.lastIndex])
    a.removeAt(a.lastIndex)
    println(a.joinToString().replace(",", ""))
}