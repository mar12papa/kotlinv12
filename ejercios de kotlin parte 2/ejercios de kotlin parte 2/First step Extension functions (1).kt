fun Int.isPositive() = this > 0

fun String.toLowercaseString(): String = this.lowercase()

fun main() {
    println(1.isPositive()) // true
    println("Hello World!".toLowercaseString()) // hello world!
}