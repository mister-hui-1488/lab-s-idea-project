fun main() {
    var sum = 0
    var product = 1

    while (true) {
        println("ебашь две цифры (или 'стоять блять' для выхода):")
        val input = readLine()!!
        if (input.lowercase() == "стоять блять") break

        val values = input.split(" ")
        val num1 = values[0].toInt()
        val num2 = values[1].toInt()

        sum += num1 + num2
        product *= num1 * num2

        println("Сумма: $sum, Произведение: $product")
    }
}