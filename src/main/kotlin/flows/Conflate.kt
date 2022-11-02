package flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    runBlocking {
        val time: Long = measureTimeMillis {
            firstFlow()
                .conflate()
                .collect{
                        value -> delay(300)
                    println(value)
                }
        }
        println("$time ms")
    }
}