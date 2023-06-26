// Crea un proyecto nuevo de Kotlin en IntelliJ.
// Crea una función que reciba un Integer y un String, siendo el Integer la edad de una persona y el String su nombre.
// Llámala “calcularPrecio”. La función debe devolver un String que contenga:
// Si la persona es menor de 18 años, entonces debe devolver: “{Nombre}, debes abonar 5€”
// Si la persona tiene entre 18 y 65, entonces debe devolver: “{Nombre}, debes abonar 10€”
// Si la persona tiene más de 65, entonces debe devolver: “{Nombre}, para ti es gratis”

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("¿Cómo te llamas? ")
    var nombre:String = scanner.nextLine()
    print("¿Cuántos años tienes? ")
    var edad:Int = scanner.nextInt()

    println("${calcularPrecio(edad, nombre)}")
}

fun calcularPrecio(edad:Int, nombre:String) : String{
    if (edad < 18)
        return "$nombre, debes abonar 5€"
    else if (edad > 65)
        return "$nombre, para ti es gratis"
    else
        return "$nombre, debes abonar 10€"
}