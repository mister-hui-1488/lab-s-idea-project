fun main() {
    println("Введите способ оплаты (наличные, кредитная карта, PayPal):")
    val paymentMethod = readLine()!!.lowercase()

    when (paymentMethod) {
        "наличные" -> println("Оплата наличными.")
        "кредитная карта" -> println("Оплата кредитной картой.")
        "paypal" -> println("Оплата через PayPal.")
        else -> println("Неверный способ оплаты.")
    }
}