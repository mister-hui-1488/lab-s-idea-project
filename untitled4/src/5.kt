fun main() {
    println("Введите число:")
    val number = readLine()!!.toInt()

    val sign = when {
        number > 0 -> "Положительное"
        number < 0 -> "Отрицательное"
        else -> "Ноль"
    }
    println("Знак числа: $sign")
}