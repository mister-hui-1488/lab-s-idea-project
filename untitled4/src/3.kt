fun main() {
    println("Введите оценку (0-100):")
    val grade = readLine()!!.toInt()

    val result = when (grade) {
        in 90..100 -> "шикарно"
        in 80..89 -> "а ты хорш"
        in 70..79 -> "иди учи уроки"
        in 60..69 -> "иди учи уроки"
        else -> "давай по новой"
    }
    println("Оценка: $result")
}