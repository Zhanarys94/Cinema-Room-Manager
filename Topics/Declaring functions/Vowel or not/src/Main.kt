fun isVowel(letter: Char): Boolean {
    if (letter in "aeoiuAEOIU" && letter != 'Y') return true else return false
}
fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
