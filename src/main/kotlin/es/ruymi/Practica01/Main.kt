package es.ruymi.Practica01

enum class RazaBondadosa(val valor: Int){
    PELOSOS(1), SUREÑOS_BUENOS(2), ENANOS(3), NUMENOREANOS(4), ELFOS(5);
}
enum class RazaMalvadas(val valor: Int){
    ORCOS(2), SUREÑOS_MALOS(2), GOBLINS(2), HUARGOS(2), TROLLS(5)
}

fun main(){

    val listaBuenos = Array((Math.random().toInt()) * 30 + 10){ RazaBondadosa.values()[((Math.random().toInt() * 5) + 1)] }
    val listaMalos = Array((Math.random().toInt()) * 30 + 10){ RazaMalvadas.values()[((Math.random().toInt()) * 5 )+ 1] }

    for(i in 0 until 10){
        var puntosBuenos = 0
        var puntosMalos = 0
        val personajeBueno = listaBuenos[(Math.random().toInt()) * listaBuenos.size]
        val personajeMalo = listaMalos[(Math.random().toInt()) * listaMalos.size]
        puntosBuenos = personajeBueno.valor
        puntosMalos = personajeMalo.valor
        if (personajeMalo.valor > personajeBueno.valor ){
            println("$i º batalla gana las razas malvadas.")
            println("Personaje de la raza buena: $personajeBueno ha conseguido: $puntosBuenos puntos.")
            println("Personaje de la raza mala: $personajeMalo ha conseguido: $puntosMalos puntos.")
        } else if (personajeMalo.valor < personajeBueno.valor ){
            println("$i º batalla gana las razas buenass.")
            println("Personaje de la raza buena: $personajeBueno ha conseguido: $puntosBuenos puntos.")
            println("Personaje de la raza mala: $personajeMalo ha conseguido: $puntosMalos puntos.")
        } else{
            println("$i º batalla empatan las razas")
            println("Personaje de la raza buena: $personajeBueno ha conseguido: $puntosBuenos puntos.")
            println("Personaje de la raza mala: $personajeMalo ha conseguido: $puntosMalos puntos.")
        }
    }

}
