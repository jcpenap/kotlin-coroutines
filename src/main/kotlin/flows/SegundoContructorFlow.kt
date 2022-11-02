package flows

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        secondFlow().collect { value -> println(value) }
        println("Finished")
    }
}

fun secondFlow(): Flow<Int> {
    return flowOf(1, 2, 3)
}