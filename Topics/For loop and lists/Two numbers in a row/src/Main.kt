fun main() {
    val numbers = MutableList(readln().toInt()) { readln() }.joinToString(" ")
    val pm = readln().split(" ").joinToString(" ")
    if (pm in numbers || pm.reversed() in numbers) {
        println("NO")
    } else if (pm[0] in numbers || pm[1] in numbers) println("YES") else println("NO")
}