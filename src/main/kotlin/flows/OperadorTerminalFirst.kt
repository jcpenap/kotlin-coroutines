package flows

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        var number: Int = (1..3).asFlow().first()
        println(number)
    }
}