package flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        var ejemplo: Flow<Flow<String>> = (1..3).asFlow().map { requestFlow(it) }
    }
}

fun requestFlow(i: Int): Flow<String> = flow {
    emit("$i: First")
    delay(500)
    emit("$i: Second")
}