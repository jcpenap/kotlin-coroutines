package flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    show()
}

fun show() {
//    listar().forEach { i -> println(i) }
//    secuencia().forEach { i -> println(i) }
    runBlocking { runAsynchronous().forEach { i -> println(i) } }
}

fun listar(): List<Int> = listOf(63, 54, 79)

fun secuencia(): Sequence<Int> = sequence {
    for (i: Int in 1..3) {
        Thread.sleep(1000)
        yield(i)
    }
}

suspend fun runAsynchronous(): List<Int> {
    return runBlocking {
        delay(1000)
        return@runBlocking listOf(1,2,3)
    }
}