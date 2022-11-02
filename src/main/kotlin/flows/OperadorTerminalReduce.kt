package flows

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        var number: Int = (1..3).asFlow()
            .reduce{a, b -> a + b}
        println(number)
    }
}