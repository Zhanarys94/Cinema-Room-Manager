fun main() {
    val peanut = readln().toInt()
    val weekend = readln().toBooleanStrict()
    print(peanut in 10..20 && weekend == false || peanut in 15..25 && weekend == true)
}