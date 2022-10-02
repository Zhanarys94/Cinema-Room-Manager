fun main() {
    val n = readln().toInt()
    val numbers = MutableList(n) { readln().toInt() }
    if (numbers.contains(readln().toInt())) println("YES") else println("NO")
}