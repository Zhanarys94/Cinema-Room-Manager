fun main() {    
    val (a, b, h) = Array(3) { readln().toInt() }
    if (h in a..b) {
        println("Normal")
    } else if (h < a) {
        println("Deficiency")
    } else {
        println("Excess")
    }
}
