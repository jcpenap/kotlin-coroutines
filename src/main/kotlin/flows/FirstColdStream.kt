package flows

import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        println("Llamando flow...")
        var flow = firstFlow()
        println("Collect...")
        flow.collect{value -> println(value)}
        println("Collect again...")
        flow.collect{value -> println(value)}
    }
}