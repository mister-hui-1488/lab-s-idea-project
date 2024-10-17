fun main() {
    println("Введите длину 1 стороны:")
    val side1 = readLine()!!.toDouble()
    println("Введите длину 2 стороны:")
    val side2 = readLine()!!.toDouble()
    println("Введите длину 3 стороны:")
    val side3 = readLine()!!.toDouble()

    val triangleType = when {
        side1 == side2 && side2 == side3 -> "Равносторонний"
        side1 == side2 || side1 == side3 || side2 == side3 -> "Равнобедренный"
        else -> "Разносторонний"
    }
    println("Тип треугольника: $triangleType")
}