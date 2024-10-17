fun main() {
    println("Введите страну (США, Россия, Япония и т.д.):")
    val country = readLine()!!.uppercase()

    val nationality = when (country) {
        "США" -> "Американец"
        "РОССИЯ" -> "Россиянин"
        "ЯПОНИЯ" -> "Японец"
        else -> "Неизвестная национальность"
    }
    println("Национальность: $nationality")
}