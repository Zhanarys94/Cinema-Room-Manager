fun main() {
    val num = readln().toInt()
    print(
        if (num > 0) "positive" else if (num == 0) "zero" else "negative"
    )
}
