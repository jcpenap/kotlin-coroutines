package flows

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        (1..5).asFlow()
            .filter { i ->
                println("Filtrado $i")
                i%2 == 0
            }
            .map { i -> println()
                println("Map $i")
                "String $i"
            }
            .collect{
                i->
                println("Collect $i")
            }
    }
}