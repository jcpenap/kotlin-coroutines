package bloquear

fun main(args: Array<String>) {
    blockingExample()
}

fun longTaskWithMessage(message: String){
    Thread.sleep(4000)
    println(message + Thread.currentThread().name)
}

fun blockingExample() {
    println("Tarea1 " + Thread.currentThread().name)
    longTaskWithMessage("Tarea2 ")
    println("Tarea3 " + Thread.currentThread().name)
}