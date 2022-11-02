package flows

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main(args: Array<String>) {
    runBlocking {
        withTimeoutOrNull(2500) {
            firstFlow().collect { value -> println(value) }
        }
        println("Finished")
    }
}