package es.ruymi.hearthStone.models


import es.ruymi.hearthStone.utils.Utils
import java.time.LocalDate
import java.util.*


class Item(var id: UUID, var fecha: LocalDate, var nivel: Byte, var tipo: ItemType){

}
enum class ItemType(){
    COMIDA, HECHIZO, MATERIAL, POCION
}

abstract class Personaje(var id: UUID, var name: String, var fecha: LocalDate, var vida: Byte, var nivel: Byte, var lista: List<Item>?){

}

class Elfos(var inmortalidad: Byte = 10): Personaje(UUID.randomUUID(), Utils().nombreAleatorio() , LocalDate.now(), 50, ){

}

/*
    HUMANOS
    TRASGO{

    }
}
+/
 */