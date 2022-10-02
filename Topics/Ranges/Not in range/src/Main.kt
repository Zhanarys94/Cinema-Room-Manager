fun main() {
    var result = 0 // starting value of the factorial
    for (i in 1..100) { // the product from 2 to n
        result += i
    }
    println(result)
}