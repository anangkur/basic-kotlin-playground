import kotlinx.coroutines.*

// TODO 1
fun sum(valueA: Int, valueB: Int): Int {
    return valueA + valueB
} return valufun multiple(valueA: Int, valueB: Int): Int {
    return valueA * valueB
}nt {
    delay(2000L)
    return valueA * valueB
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiplprintln() { multiple(20, 20) }

    // TODO 3
    println("Result sum: ${resultSum.await()}")
    println("Result multiple: ${resultMultiple.await()}")
}