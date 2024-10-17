fun simpleSort(arr: IntArray): IntArray {
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
    return arr
}

fun main() {
    val numbers = intArrayOf(14, 88, 2, 2, 8)
    val sortedNumbers = simpleSort(numbers)
    println("Отсортированный массив: ${sortedNumbers.joinToString()}")
}

