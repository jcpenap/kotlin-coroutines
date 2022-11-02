package launch

import kotlinx.coroutines.*
import suspend.delayCoroutine

fun main (args : Array<String>){
    launch()
    Thread.sleep(5000)
}

/***
 Tarea1 main
 Tarea3 main
 Tarea2: DefaultDispatcher-worker-1 ofter 4 segs
 */
fun launch() {
    println("Tarea1 " + Thread.currentThread().name)
    GlobalScope.launch {
        delayCoroutine("Tarea2: ")
    }
    println("Tarea3 " + Thread.currentThread().name)
}