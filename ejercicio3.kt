
// Utilizando los bucles vistos hasta ahora, realiza un programa en Kotlin que permita jugar a adivinar un número entre
// el 0 y el 9.

import java.util.Scanner
import javax.swing.plaf.synth.SynthOptionPaneUI

fun main() {

    val scanner = Scanner(System.`in`)
    var jugar: Boolean = true
    while(jugar) {
        println("--- MENÚ ---")
        println("1. Jugar con 5 oportunidades.")
        println("2. Jugar sin oportunidades.")
        println("3. Salir.")
        print("Introduce una opción del menú: ")
        var opcionMenu = scanner.nextInt()
        when(opcionMenu) {
            1 -> {
                val numeroAdivinar:Int = (0..9).random()
                println("Encuentra un número entre el 0 y el 9")
                bucleRepeat(numeroAdivinar)
            }
            2 -> {
                val numeroAdivinar:Int = (0..9).random()
                println("Encuentra un número entre el 0 y el 9")
                bucleWhile(numeroAdivinar)
            }
            3 -> {
                println()
                println("V U E L V E    P R O N T O !!")
                jugar = false
            }
        }

    }

}

fun bucleRepeat(numeroAdivinar:Int) {

    var oportunidades:Int = 5
    val scanner = Scanner(System.`in`)
    println(numeroAdivinar)
    println("Tienes $oportunidades oportunidades.")

    repeat(oportunidades) {oportunidad ->

        println("Escribe tu número:")
        var numeroUsuario = scanner.nextInt()

        when {
            numeroUsuario == numeroAdivinar -> {
                println("Enhorabuena! El número era $numeroAdivinar")
                return
            }
            numeroUsuario < numeroAdivinar -> {
                oportunidades--
                if (oportunidades == 0) {
                    println("El número buscado es más grande. Te quedan $oportunidades oportunidades.")
                    println("FIN DEL JUEGO")
                } else {
                    println("El número buscado es más grande. Te quedan $oportunidades oportunidades.")
                }
            }
            numeroUsuario > numeroAdivinar -> {
                oportunidades--
                if (oportunidades == 0) {
                    println("El número buscado es más pequeño. Te quedan $oportunidades oportunidades.")
                    println("FIN DEL JUEGO")
                } else {
                    println("El número buscado es más pequeño. Te quedan $oportunidades oportunidades.")
                }
            }
            else -> println("ERROR")
        }
    }

}

fun bucleWhile(numeroAdivinar:Int) {

    var numeroEncontrado:Boolean = false
    while(!numeroEncontrado) {

        println("Escribe tu número:")
        var numeroUsuario = readLine()
        if (numeroUsuario != null) {

            if (numeroUsuario.toInt() == numeroAdivinar) {
                println("Enhorabuena! El número era $numeroAdivinar")
                break
            } else if (numeroUsuario.toInt() < numeroAdivinar) {
                println("El número buscado es más grande.")
            } else {
                println("El número buscado es más pequeño.")
            }

        }
    }

}