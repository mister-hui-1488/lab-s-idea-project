
fun main() {
    val secretNumber = (1..100).random()
    var guessCount = 0

    println("Угадайте число от 1 до 100:")

    while (true) {
        val guess = readLine()!!.toInt()
        guessCount++

        when {
            guess < secretNumber -> println("Загаданное число больше")
            guess > secretNumber -> println("Загаданное число меньше")
            else -> {
                println("Поздравляю! Вы угадали за $guessCount попыток.")
                break
            }
        }
    }
}