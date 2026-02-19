fun findOutOfStockBooks(inventory: List<Int>): List<Int> {
    return inventory.mapIndexedNotNull { index, quantity ->
        if (quantity == 0) index else null
    }
}

fun main() {
    val inventory = listOf(3, 0, 7, 0, 5)
    println(findOutOfStockBooks(inventory))
    // [1, 3]
}