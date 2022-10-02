package cinema

import java.util.*

const val normalPrice = 10
const val backRowsPrice = 8
var soldTickets = 0
var income = 0

fun main() {
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()
    val cinema = MutableList(rows) {
        MutableList(seats) { 'S' }
    }
    menu(cinema)
}

fun menu(cinema: MutableList<MutableList<Char>>) {
    while (true) {
        println(
            "\n1. Show the seats\n" +
            "2. Buy a ticket\n" +
            "3. Statistics\n" +
            "0. Exit"
        )
        when (readln().toInt()) {
            1 -> cinemaMap(cinema)
            2 -> buyTicket(cinema)
            3 -> statistics(cinema)
            0 -> return
        }
    }
}

fun cinemaMap(cinema: MutableList<MutableList<Char>>) {
    println("\nCinema:")
    print(" ")
    for (index in 1..cinema[0].size) print(" $index")
    for(index in 0..cinema.lastIndex) {
        print("\n${index + 1} ${cinema[index].joinToString(" ")}")
    }
    println()
}

fun buyTicket(cinema: MutableList<MutableList<Char>>) {
    println("\nEnter a row number:")
    val row = readln().toInt()
    println("Enter a seat number in that row:")
    val seat = readln().toInt()
    try {
        if (cinema[row - 1][seat - 1] != 'B') {
            cinema[row - 1][seat - 1] = 'B'
            income += if (cinema.size * cinema[0].size <= 60 || cinema.size / 2 >= row) normalPrice
            else backRowsPrice
            ++soldTickets
            println("Ticket price: $${ if (cinema.size * cinema[0].size <= 60 || cinema.size / 2 >= row) normalPrice else backRowsPrice }")
        } else {
            println("That ticket has already been purchased!")
            return buyTicket(cinema)
        }
    } catch (e: IndexOutOfBoundsException) {
        println("Wrong input!")
        buyTicket(cinema)
    }
}

fun statistics(cinema: MutableList<MutableList<Char>>) {
    val maxIncome = if (cinema.size * cinema[0].size <= 60) {
        normalPrice * cinema.size * cinema[0].size
    } else {
        (cinema.size / 2 * cinema[0].size) * normalPrice + ((cinema.size - cinema.size / 2) * cinema[0].size * backRowsPrice)
    }
    val rawPercentage: Double = soldTickets.toDouble() / (cinema.size * cinema[0].size) * 100
    val percentage = "%.2f".format(Locale("en", "US"), rawPercentage)
    println("Number of purchased tickets: $soldTickets")
    println("Percentage: $percentage%")
    println("Current income: $$income")
    println("Total income: $$maxIncome")
}