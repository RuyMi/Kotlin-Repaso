package es.ruymi.ejercicios

//Pedir número de tarjeta de credito y comprobar que es una tarjeta de crédito y, posteriormente, pedir un dni y comprobar que el dni es válido.


fun main(){
    val regexTarjeta: Regex = Regex("""\d{16}""")
    val regexDni: Regex = Regex("""\d{8}[A-Za-z]""")
    var res = false
    var tarjeta = ""
    var dni = "0"

    do {
        println("Dime una tarjeta de credito: ")
        tarjeta = readln()
        res = tarjeta.matches(regexTarjeta)
    } while (!res)

    res = false

    do {
        println("Dime un DNI: ")
        dni = readln()
        res = dni.matches(regexDni)
    } while (!res)

    println("Tarjeta escrita: $tarjeta")
    println("DNI escrito: $dni")
}