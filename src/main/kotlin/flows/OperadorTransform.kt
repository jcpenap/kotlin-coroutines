package flows

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        (1..3).asFlow()
            .transform { request ->
                emit("Making request $request")
                emit(performRequest(request))
            }
            .collect{
                    response -> println(response)
            }
    }
}