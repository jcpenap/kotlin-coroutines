package dispatcher

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main (args : Array<String>){
    dispatcher()
}

fun dispatcher() {
    runBlocking {
        println("Hilo en el que se ejecuta 1: ${Thread.currentThread().name}")
    }

    //(Unconfined) No estamos interesados en optimizar el hilo
    runBlocking(Dispatchers.Unconfined) {
        println("Hilo en el que se ejecuta 2: ${Thread.currentThread().name}")
    }

    //(Default) Utilizado para ejecusiones de uso intensivo de la CPU
    runBlocking(Dispatchers.Default) {
        println("Hilo en el que se ejecuta 3: ${Thread.currentThread().name}")
    }

    //(Default) Utilizado para I/O como WebServices o entradas a base de datos
    runBlocking(Dispatchers.IO) {
        println("Hilo en el que se ejecuta 4: ${Thread.currentThread().name}")
    }

    // Cuando queremos ejecutar un hilo de ejecusion propio
    runBlocking(newSingleThreadContext("MiHilo")) {
        println("Hilo en el que se ejecuta 5: ${Thread.currentThread().name}")
    }

    //For Android devices
    /*runBlocking(Dispatchers.Main) {
        println("Hilo en el que se ejecuta 6: ${Thread.currentThread().name}")
    }*/
}