package flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    runBlocking {
        val time: Long = measureTimeMillis {
            firstFlow()
                .collectLatest{
                        value ->
                    println("Collecting $value")
                    delay(300)
                    println("Finalizado $value")
                }
        }
        println("$time ms")
    }
}