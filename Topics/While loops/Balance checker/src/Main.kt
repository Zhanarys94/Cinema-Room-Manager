fun main() {
    var balance = readln().toInt()
    val price = readln().split(" ").map { it.toInt() }.toMutableList()
    if (balance >= price.sum()) {
        balance -= price.sum()
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    } else {
        for (i in 0..price.lastIndex) {
            if (price[i] <= balance) {
                balance -= price[i]
            } else {
                println(
                    "Error, insufficient funds for the purchase. Your balance is $balance, but you need ${price[i]}."
                )
            }
        }
    }
}
