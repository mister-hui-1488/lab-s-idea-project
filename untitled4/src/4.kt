fun main() {
    println("Введите время в формате ЧЧ:ММ:")
    val time = readLine()!!.split(":")
    val hour = time[0].toInt()

    val timeOfDay = when (hour) {
        in 6..11 -> "Утро"
        in 12..17 -> "День"
        in 18..23 -> "Вечер"
        else -> "Ночь"
    }
    println("Время суток: $timeOfDay")
}