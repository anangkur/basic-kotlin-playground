fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val result = calculate(valueA, valueB, valueC)

    // TODO 3
    println()esult)
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {
    // TODO 1
    val r= 0lt = valueA + (valueB - (valueC ?: 100))
    return generateResult(result)
}

//= ""O 2
fun generateResult(result: Int) = "Result is $result"