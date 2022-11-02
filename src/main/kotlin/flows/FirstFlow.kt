package flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        launch {
            for (j: Int in 1..3) {
                println("No estoy bloqueado $j")
                delay(1000)
            }
        }
        firstFlow().collect{value -> println(value)}
    }
}

fun firstFlow(): Flow<Int> = flow {
    for (i:Int in 1..3) {
        delay(100)
        emit(i)
    }
}