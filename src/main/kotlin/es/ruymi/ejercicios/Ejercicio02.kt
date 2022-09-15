package es.ruymi.ejercicios

//Pedir número de tarjeta de credito y comprobar que es una tarjeta de crédito y, posteriormente, pedir un dni y comprobar que el dni es válido.


fun main(){
    val regexTarjeta: Regex = Regex("""\d{16}""")
    val regexDni: Regex = Regex("""\d{8}[A-Za-z]""")
    val regexEmails: Regex = Regex("""[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}""")
    var res = false
    var tarjeta = ""
    var dni = "0"
    var email = ""

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

    do{
        println("Dime un email: ")
        email = readln()
        res = email.matches(regexEmails)
    } while (!res)


    println("Tarjeta escrita: $tarjeta")
    println("DNI escrito: $dni")
    println("Email escrita: $email")


    fun comprobarDni(dni: String): Boolean {
        val abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val res = (dni.dropLast(1).toInt())%23
        if(dni.takeLast(1)== abc[res].toString()){
            return true
        }
        return false


    }
}