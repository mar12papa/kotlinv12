// Aqui aprendimos acerca de las listas, conjuntos y mapas, aprendimos a hacer consultas para imprimir 
// los elementos y modificar listas agregando más elementos

// Ejercicio 1
fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println("There are ${greenNumbers.count() + redNumbers.count()} numbers in total ")
}

// Ejercicio 2
fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}

// Ejercicio 3
fun main() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}

