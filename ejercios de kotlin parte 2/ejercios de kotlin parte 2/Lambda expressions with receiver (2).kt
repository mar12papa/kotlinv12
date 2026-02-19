fun List<Int>.incremented(): List<Int> {
    val originalList = this
    return buildList {
        originalList.forEach { add(it + 1) }
    }
}

fun main() {
    val originalList = listOf(1, 2, 3)
    val newList = originalList.incremented()
    println(newList)
    // [2, 3, 4]
}