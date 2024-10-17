fun main() {
    println("Введите тип пищи (суп, каша, мясо, рыба, овощи):")
    val foodType = readLine()!!.lowercase()

    val cookingTime = when (foodType) {
        "суп" -> "30-40 минут"
        "каша" -> "15-20 минут"
        "мясо" -> "40-60 минут"
        "рыба" -> "20-30 минут"
        "овощи" -> "10-15 минут"
        else -> "Неизвестный тип пищи"
    }
    println("Время приготовления: $cookingTime")
}