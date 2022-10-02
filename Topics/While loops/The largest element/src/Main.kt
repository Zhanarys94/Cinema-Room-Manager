import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = Int.MIN_VALUE
    do {
        val b = scanner.nextInt()
        a = if (b > a) b else a
    }   while(b != 0)
    println(a)
}