package flows

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        (1..3).asFlow()
            .take(2)
            .map { request -> performRequest(request) }
            .collect{
                    response -> println(response)
            }
    }
}