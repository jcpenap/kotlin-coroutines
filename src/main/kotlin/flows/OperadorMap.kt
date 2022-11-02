package flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        (1..3).asFlow()
            .map { request -> performRequest(request) }
            .collect{
            response -> println(response)
        }
    }
}

suspend fun performRequest(request: Int): String {
    delay(1000)
    return "response $request"
}