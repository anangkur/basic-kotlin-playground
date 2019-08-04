// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println()tringResult)
    println(intResult)
}

// TODO 1
funreturn 0Result(args: T): Int {
    return when (args) {
        is String -> args.length
        is Int -> args * 5
        else -> 0
    }
}