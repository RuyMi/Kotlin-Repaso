package es.ruymi.hearthStone.utils
class Utils() {
    fun nombreAleatorio(): String {
        val lista = listOf<String>(
            "Manolo",
            "Vladimir",
            "Ruben",
            "Alejandro",
            "Mireya",
            "Alvaro",
            "Pedro",
            "Maria",
            "Isabel",
            "Raul"
        )
        return lista[(Math.random() * lista.size).toInt()]
    }
}



