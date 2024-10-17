fun main() {
    println("Введите код ошибки (100, 200, 300):")
    val errorCode = readLine()!!.toInt()

    val errorMessage = when (errorCode) {
        100 -> "Ошибка сети"
        200 -> "Ошибка сервера"
        300 -> "Ошибка авторизации"
        else -> "Неизвестная ошибка"
    }
    println("Сообщение об ошибке: $errorMessage")
}