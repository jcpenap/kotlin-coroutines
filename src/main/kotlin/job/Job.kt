package job

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import launch.launch
import suspend.delayCoroutine

fun main (args : Array<String>){
    exampleJob()
}


fun exampleJob() {
    println("Tarea1 " + Thread.currentThread().name)
    val job = GlobalScope.launch {
        delayCoroutine("Tarea2: ")
    }
    println("Tarea3 " + Thread.currentThread().name)
    job.cancel()
}