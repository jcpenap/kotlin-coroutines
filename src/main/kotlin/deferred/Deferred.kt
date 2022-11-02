package deferred

import async.asyncAwait
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main (args : Array<String>){
    asyncAwaitDeferred()
    /*measureTime()*/
}

suspend fun calculateHard(): Int {
    delay(2000)
    return 15
}

fun asyncAwaitDeferred() = runBlocking{
    println(System.currentTimeMillis().toString())
    val number1: Deferred<Int> = async {
        calculateHard()
    }
    println(System.currentTimeMillis().toString())
    val number2: Deferred<Int> = async {
        calculateHard()
    }
    println(System.currentTimeMillis().toString())
    val result = number1.await() + number2.await()
    println(result.toString())
}

fun measureTime() {
    println(measureTimeMillis { asyncAwait() }.toString())
    println(measureTimeMillis { asyncAwaitDeferred() }.toString())
}