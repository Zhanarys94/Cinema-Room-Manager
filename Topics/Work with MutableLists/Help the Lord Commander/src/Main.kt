fun main() {  
    val beyondTheWall = readln().split(", ").map { it }.toMutableList()
    val backToTheWall = readln().split(", ").map { it }.toMutableList()
    // do not touch the lines above
    if (beyondTheWall.sorted() == backToTheWall.sorted()) println("true") else println("false")
}