package flows

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        thirdFlow().collect { value -> println(value) }
        println("Finished")
    }
}

fun thirdFlow(): Flow<Int> {
    return (1..3).asFlow()
}