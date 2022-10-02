fun main() {
    val nums = MutableList(readln().toInt()) { readln().toInt() }
    val (p, m) = readln().split(" ").map { it.toInt() }
    if (nums.contains(p) && nums.contains(m)) println("YES") else println("NO")
}
