
// Partiendo del ejercicio 6A, crea una Clase denominada AnalizadorEstadistico.
// Este analizador tendrá una función llamada: analizarTiradas que, recibiendo un Dado, nos deberá escribir por pantalla:
// el número de tiradas realizadas.
// el número de veces que se repite cada valor.
// la media de las tiradas.
// Modifica la clase Dado si fuera necesario

class AnalizadorEstadistico() {

    fun analizarTiradas(objetoDado:OtroDado) {
        println("\n--- ANÁLISIS ESTADÍSTICO ---")
        println("---")
        println("- Se han realizado ${objetoDado.getTiradasTotales()} tiradas en total.")

        println("---")
        val listaValorRepetido:MutableList<Int> = MutableList(objetoDado.getRangoNumerosDado() + 1) { 0 }
        objetoDado.getListaNumeros().forEach {
            listaValorRepetido[it] += 1
        }
        listaValorRepetido.removeAt(0)
        repeat(listaValorRepetido.size) {
            println("- El número ${it + 1} se ha repetido ${listaValorRepetido[it]}")
        }

        println("---")
        var sumaTotalNumeros:Int = 0
        objetoDado.getListaNumeros().forEach {
            sumaTotalNumeros += it
        }
        println("La media de tiradas es de: ${sumaTotalNumeros.toDouble() / objetoDado.getTiradasTotales()}")
    }

}

class OtroDado(private var valorMinimo:Int, private var valorMaximo:Int) {

    private var tiradasTotales:Int = 0
    private var listaNumeros:MutableList<Int> = mutableListOf()

    fun getRangoNumerosDado() : Int {
        return (valorMaximo - valorMinimo) + 1
    }

    fun getTiradasTotales() : Int {
        return tiradasTotales
    }

    fun getListaNumeros() : MutableList<Int> {
        return listaNumeros
    }

    fun tiradaSimple() : Int {
        var numRandom:Int = (valorMinimo..valorMaximo).random()
        tiradasTotales++
        listaNumeros.add(numRandom)
        return numRandom
    }

    fun tiradaMultiple(tiradas:Int) : List<Int> {
        var lista:List<Int> = List(tiradas) {
            var num:Int = (valorMinimo..valorMaximo).random()
            listaNumeros.add(num)
            num
        }
        tiradasTotales += tiradas
        return lista
    }

}


fun main() {
    var dado = OtroDado(1, 6)
    var analisisEstadistico = AnalizadorEstadistico()

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
    tiradaMultiple(12)
    tiradaMultiple(8)
    println("Tiro el dado y me ha salido el número ${dado.tiradaSimple()}")
    tiradaMultiple(3)

    analisisEstadistico.analizarTiradas(dado)
}