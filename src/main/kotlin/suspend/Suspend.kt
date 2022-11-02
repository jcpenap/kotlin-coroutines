package suspend

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
//    suspendExample()
    suspendExample2()
}

fun suspendExample() {
    println("Tarea1 " + Thread.currentThread().name)
    runBlocking {
        delayCoroutine("Tarea2 ")
    }
    println("Tarea3 " + Thread.currentThread().name)
}

suspend fun delayCoroutine(message: String) {
    delay(4000)
    println(message + Thread.currentThread().name)
}

fun suspendExample2() = runBlocking {
    println("Tarea1 " + Thread.currentThread().name)
    delayCoroutine("Tarea2 ")
    println("Tarea3 " + Thread.currentThread().name)
}
