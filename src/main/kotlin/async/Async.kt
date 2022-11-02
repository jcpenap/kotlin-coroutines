package async

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main (args : Array<String>){
    asyncAwait()
}

suspend fun calculateHard(): Int {
    delay(2000)
    return 15
}

fun asyncAwait() = runBlocking{
    println(System.currentTimeMillis().toString())
    val number1: Int = async {
        calculateHard()
    }.await()
    println(System.currentTimeMillis().toString())
    val number2: Int = async {
        calculateHard()
    }.await()
    println(System.currentTimeMillis().toString())
    val result = number1 + number2
    println(result.toString())
}