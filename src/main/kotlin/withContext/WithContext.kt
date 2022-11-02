package withContext

import async.asyncAwait
import deferred.asyncAwaitDeferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    println(measureTimeMillis { asyncAwait() }.toString())
    println(measureTimeMillis { asyncAwaitDeferred() }.toString())
    println(measureTimeMillis { withContextMethod() }.toString())
}

suspend fun calculateHard(): Int {
    delay(2000)
    return 15
}

fun withContextMethod() = runBlocking {
    val number1 = withContext(Dispatchers.IO) { calculateHard() }
    val number2 = withContext(Dispatchers.IO) { calculateHard() }
    val result: Int = number1 + number2
    println(result.toString())
}

