package flows

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        (1..3).asFlow()
            .filter { request -> request > 1 }
            .map { request -> performRequest(request) }
            .collect{
                    response -> println(response)
            }
    }
}