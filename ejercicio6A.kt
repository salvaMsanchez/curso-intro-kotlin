
// Crea una clase dado que reciba un valor mínimo y un valor máximo. Los dados deben:
//
// Poder lanzarse “tiradaSimple()”, devolviendo un número aleatorio comprendido entre el valor máximo y el mínimo.
// Poder lanzar varios tiradas “tiradaMultiple(X)” siendo X un int y devolviendo una lista con X números aleatorios
// entre el valor máximo y el mínimo.
// El dado debe almacenar en una lista todas las tiradas (individuales y múltiples) que el dado haya realizado.
// Asegurate de que nadie pueda ni cambiar ni ver ese valor.

class Dado(private var valorMinimo:Int, private var valorMaximo:Int) {

    private var tiradasTotales:Int = 0

    fun getTiradasTotales() : Int {
        return tiradasTotales
    }

    fun tiradaSimple() : Int {
        var numRandom:Int = (valorMinimo..valorMaximo).random()
        tiradasTotales++
        return numRandom
    }

    fun tiradaMultiple(tiradas:Int) : List<Int> {
        var lista:List<Int> = List(tiradas) {
            (valorMinimo..valorMaximo).random()
        }
        tiradasTotales += tiradas
        return lista
    }

}

fun main() {

    var dado = Dado(1, 6)
    println("Tiro el dado y me ha salido el número ${dado.tiradaSimple()}")

    var tiradaMultiple = {tiradas:Int ->
        var lista:List<Int> = dado.tiradaMultiple(tiradas)
        print("He tirado el dado $tiradas veces y me han salido los siguientes números: ")
        lista.forEachIndexed { index, i ->
            if (index == lista.size - 1)
                print("y $i.\n")
            else if (index == lista.size - 2)
                print("$i ")
            else
                print("$i, ")
        }

    }
    tiradaMultiple(10)

    println("Tiro el dado y me ha salido el número ${dado.tiradaSimple()}")

    println("Has realizado ${dado.getTiradasTotales()} tiradas en total.")

}