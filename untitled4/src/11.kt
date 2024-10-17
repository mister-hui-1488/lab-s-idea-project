fun main() {
    println("Введите группу крови (A, B, AB, O):")
    val bloodGroup = readLine()!!.uppercase()

    when (bloodGroup) {
        "A" -> println("Можно переливать: A, AB")
        "B" -> println("Можно переливать: B, AB")
        "AB" -> println("Можно переливать: AB")
        "O" ->
            00:05


            println("Можно переливать: A, B, AB, O")
        else -> println("Неверная группа крови.")
    }
}