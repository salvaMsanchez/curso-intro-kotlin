// Trabajando con funciones:
// Crea un proyecto nuevo de Kotlin en IntelliJ.
// Crea una función que reciba dos Integer y devuelva un Double. Llámala “sumaIntegers”. Escribe el resultado por pantalla.
// Crea una función que reciba dos String, los transforme a Integer, los sume y devuelva un Double. Llámala “sumaStrings”.
// Escribe el resultado por pantalla. Asume que los String se transforman en Int sin problemas.
// Crea una función que reciba los resultados de las 2 funciones anteriores y escriba: “sumaIntegers ha devuelto un
// {numero1} y SumaStrings ha devuelto un {numero2}. Llámala “diResultado”.

fun main() {
    val num1:Int = 2
    val num2:Int = 3
    println("El resultado de sumar $num1 y $num2 es ${sumaIntegers(num1, num2)}")

    val string1:String = "6"
    val string2:String = "9"
    println("El resultado de sumar $string1 y $string2 es ${sumaStrings(string1, string2)}")

    diResultado(sumaIntegers(num1, num2), sumaStrings(string1, string2))
}

fun sumaIntegers(num1:Int, num2:Int) : Double {
    return (num1 + num2).toDouble()
}

fun sumaStrings(string1:String, string2:String) : Double {
    return (string1.toInt() + string2.toInt()).toDouble()
}

fun diResultado(resultado1:Double, resultado2:Double) {
    println("La función sumaIntegers ha devuelto un $resultado1 y sumaStrings ha devuelto un $resultado2")
}