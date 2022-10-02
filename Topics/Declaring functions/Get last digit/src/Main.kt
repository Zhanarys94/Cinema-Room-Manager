const val EXTRACT_LAST_DIGIT = 10

fun getLastDigit(num: Int) = Math.abs(num % EXTRACT_LAST_DIGIT)

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
