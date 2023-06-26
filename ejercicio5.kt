
// Transforma las siguientes funciones en Lambdas y ejecútalas.
//
// fun lambda1() { println("Esta Lambda escribe: Hola") }
// fun lambda2(integer : Int) {  println("Esta Lambda recibe un Int y lo escribe: $integer") }
// fun ejercicio3(posicion : Int, list : List<Any>) { println("Esta Lambda recibe un Int y una Lista. Escribe
// al elemento que haya en la posición ${ list[posicion]}") }

var lambda1 = {
    println("Esta lambda escribe: Hola")
}

var lambda2 = {integer:Int ->
    println("Esta lambda recibe un Int y lo escribe: $integer")
}

var lambda3 = {posicion:Int, lista:List<Any> ->
    println("Esta lambda recibe un Int y una lista. Escribe el elemento que haya en la posición $posicion: ${lista[posicion]}")
}

fun main() {

    val lista:List<Any> = listOf(10,'R', "Hola, Mundo!", 13, "Hello!")

    lambda1()
    // lambda1.invoke()
    lambda2(3)
    // lambda2.invoke(3)
    lambda3(2, lista)
    // lambda3.invoke(2, lista)

}