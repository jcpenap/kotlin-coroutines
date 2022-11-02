package flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val nums = (1..3).asFlow()
    val strs = flowOf("Uno", "Dos", "Tres")
    runBlocking {
        val time: Long = measureTimeMillis {
            nums.zip(strs) { a, b ->
                "Zip: $a -> $b"
            }.collect {
                delay(1000)
                println(it)
            }
        }
        println("$time ms")
    }
}