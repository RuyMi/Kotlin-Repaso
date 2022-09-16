package es.ruymi.Practica01

import kotlin.math.roundToInt

enum class RazaBondadosa(val valor: Int){
    PELOSOS(1), SUREÑOS_BUENOS(2), ENANOS(3), NUMENOREANOS(4), ELFOS(5);
}
enum class RazaMalvadas(val valor: Int){
    ORCOS(2), SUREÑOS_MALOS(2), GOBLINS(2), HUARGOS(2), TROLLS(5)
}

fun main(){
    var batallasGanadasBuenos = 0
    var batallasGanadasMalos = 0
    val listaBuenos = Array((Math.random().toInt()) * 30 + 10){ RazaBondadosa.values()[((Math.random() * 4)).roundToInt()] }
    val listaMalos = Array((Math.random().toInt()) * 30 + 10){ RazaMalvadas.values()[((Math.random() * 4 )).roundToInt()] }

    for(i in 0 until 10){
        var puntosBuenos: Int
        var puntosMalos: Int
        val personajeBueno = listaBuenos[((Math.random() * listaBuenos.size).toInt())]
        val personajeMalo = listaMalos[((Math.random()) * listaMalos.size).toInt()]
        puntosBuenos = personajeBueno.valor
        puntosMalos = personajeMalo.valor
        if (personajeMalo.valor > personajeBueno.valor ){
            println("$i º batalla gana las razas malvadas.")
            println("Personaje de la raza buena: $personajeBueno ha conseguido: $puntosBuenos puntos.")
            println("Personaje de la raza mala: $personajeMalo ha conseguido: $puntosMalos puntos.")
            batallasGanadasMalos++
        } else if (personajeMalo.valor < personajeBueno.valor ){
            println("$i º batalla gana las razas buenas.")
            println("Personaje de la raza buena: $personajeBueno ha conseguido: $puntosBuenos puntos.")
            println("Personaje de la raza mala: $personajeMalo ha conseguido: $puntosMalos puntos.")
            batallasGanadasBuenos++
        } else{
            println("$i º batalla empatan las razas")
            println("Personaje de la raza buena: $personajeBueno ha conseguido: $puntosBuenos puntos.")
            println("Personaje de la raza mala: $personajeMalo ha conseguido: $puntosMalos puntos.")
        }
    }
    println("La raza mala ha conseguido: $batallasGanadasMalos y la raza buena $batallasGanadasBuenos")
}
