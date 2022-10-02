fun main() {
    val range = readln().toInt()..readln().toInt()
    for (i in range) {
        if (i % 3 == 0 && i % 5 != 0) {
            println("Fizz")
        } else if (i % 5 == 0 && i % 3 != 0) {
            println("Buzz")
        } else if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else println(i)
    }
}