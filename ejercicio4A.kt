// Parte 1: Crea una lista “listaRandom” de 100 elementos compuesta de números aleatorios comprendidos entre el 0 y el 9.
// Imprime la lista por pantalla

// Parte 2: Crea una lista vacía “listaResultado” en cuya posición…
// Posición 0 se debe contar cuantos 0 hay en la listaRandom.
// Posición 1 se debe contar cuantos 1 hay en la listaRandom.
// etc. con todos los números.

fun main() {
    var listaRandom:ArrayList<Int> = listaRandom()
    imprimirListaRandom(listaRandom)

    var listaResultado:ArrayList<Int> = listaResultado(listaRandom)
    imprimirListaResultado(listaResultado)

    println()

    sumaListaResultado(listaResultado)
}

fun listaRandom() : ArrayList<Int> {
    var listaRandom:ArrayList<Int> = arrayListOf()
    repeat(100) {
        var numRandom:Int = (0..9).random()
        listaRandom.add(numRandom)
    }
    return listaRandom
}

fun imprimirListaRandom(listaRandom:ArrayList<Int>) {
    for (num in listaRandom)
        println(num)
}

fun listaResultado(listaRandom:ArrayList<Int>) : ArrayList<Int> {
    var listaResultado:ArrayList<Int> = arrayListOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    for (num in listaRandom) {
        when(num) {
            0 -> listaResultado[0] = listaResultado[0] + 1
            1 -> listaResultado[1] = listaResultado[1] + 1
            2 -> listaResultado[2] = listaResultado[2] + 1
            3 -> listaResultado[3] = listaResultado[3] + 1
            4 -> listaResultado[4] = listaResultado[4] + 1
            5 -> listaResultado[5] = listaResultado[5] + 1
            6 -> listaResultado[6] = listaResultado[6] + 1
            7 -> listaResultado[7] = listaResultado[7] + 1
            8 -> listaResultado[8] = listaResultado[8] + 1
            9 -> listaResultado[9] = listaResultado[9] + 1
        }
    }

    return listaResultado
}

fun imprimirListaResultado(listaResultado:ArrayList<Int>) {
    listaResultado.forEachIndexed { index, i ->
        println("- El número $index aparece $i veces")
    }
}

fun sumaListaResultado(listaResultado:ArrayList<Int>) {
    var sumaTotal:Int = 0
    for (num in listaResultado) {
        sumaTotal = sumaTotal + num
    }

    println("Hay $sumaTotal números")
}