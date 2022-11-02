package cancel

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    cancelCoroutine()
}

fun cancelCoroutine() {
    runBlocking {
        val job: Job = launch {
            repeat(1000) {
                i -> println("job: $i")
                delay(500L)
            }
        }
        delay(1400)
        job.cancel()
        println("main: cansado de esperar")
    }
}