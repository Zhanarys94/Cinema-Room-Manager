fun main() {    
    val numbers = readln().split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    val a = numbers[0]
    numbers[0] = numbers.last()
    numbers[numbers.lastIndex] = a

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}
