// Realiza el ejercicio 2A utilizando un when.

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("¿Cómo te llamas? ")
    var nombre:String = scanner.nextLine()
    print("¿Cuántos años tienes? ")
    var edad:Int = scanner.nextInt()

    println("${calcularPrecioConWhen(edad, nombre)}")
}

fun calcularPrecioConWhen(edad:Int, nombre:String) : String{

    when {
        edad < 18 -> return "$nombre, debes abonar 5€"
        edad in 18..65 -> return "$nombre, debes abonar 10€"
        else -> return "$nombre, para ti es gratis"
    }

}