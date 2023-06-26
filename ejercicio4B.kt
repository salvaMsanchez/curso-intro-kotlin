
// Crea una lista de varios elementos
// Utilizando únicamente lo visto hasta ahora y este código:
// val lista = listOf("H", 1, 2, "o", 0.2, "l", 1.0, "a", 0.3, "!")
// Realiza un programa que:
// Sume todos los números de la lista en una misma variable (Integers y Doubles) e imprímelo.
// Concatena todos los String en un único String e imprímelo


fun main() {
    val lista = listOf("H", 1, 2, "o", 0.2, "l", 1.0, "a", 0.3, "!")

    var suma:Double = sumadorNumeros(lista)
    println("La suma de los números que integran la lista es de $suma")

    var concatenacion:String = concatenarStrings(lista)
    println("La palabra resultante de unir los tipo String de la lista es $concatenacion")

}

fun sumadorNumeros(lista:kotlin.collections.List<Any>) : Double {
    var suma:Double = 0.0
    for (elemento in lista) {
        when (elemento) {
            is Int -> {
                suma += elemento.toDouble()
            }
            is Double -> suma += elemento
        }
    }
    return suma
}

fun concatenarStrings(lista:kotlin.collections.List<Any>) : String {
    var concatenacion:String = ""
    lista.forEach { elemento ->
        if (elemento is String) {
            concatenacion += elemento
        }
    }
    return concatenacion
}