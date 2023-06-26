// Crea una función que reciba dos Strings, nombre y apellido. La función debe escribir por pantalla: Hola,
// soy “nombre” y me apellido “apellido” (donde “nombre” y “apellido” son los valores recibidos en las función
// Crea una función que reciba dos Int, num1 y num2 y devuelva un String. La función debe sumarlos y devolver un string
// con el resultado.

fun main() {
    saludar("Salva", "Moreno")

    val num1:Int = 5
    val num2:Int = 3
    println("El resultado de sumar $num1 y $num2 es ${sumaIntAString(num1, num2)}")
}

fun saludar(nombre:String, apellido:String) {
    println("Hola, soy $nombre y me apellido $apellido")
}

fun sumaIntAString(num1:Int, num2:Int) : String {
    return (num1 + num2).toString()
}