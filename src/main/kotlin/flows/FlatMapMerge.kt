package flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flatMapMerge
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        val startTime = System.currentTimeMillis()
        (1..3).asFlow().onEach { delay(100) }
            .flatMapMerge { requestFlow(it) }
            .collect{ value ->
                println("$value at ${System.currentTimeMillis() - startTime} ms from start")
            }
    }
}