package flows

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
       var lista: List<Int> = (1..3).asFlow().toList()
        println(lista)
    }
}