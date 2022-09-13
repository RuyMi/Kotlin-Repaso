package es.ruymi.ejercicios

//Diferencia entre prototipo, tipo y clase y diferencia entre subtipo y subclase
//Un objeto se define con una clase pero pertenece a un tipo.
/*
Las clases son como planos de diseño en donde se describe la información y el comportamiento que tendrán los objetos,
luego en nuestro código podemos hacer uso de esa información y ese comportamiento a través de los objetos,
que son entidades que hay que instanciar manualmente cuando se las necesite.
Con la clase podemos crear muchas copias del mismo objeto y luego cada copia tendrá su propio estado y
evolucionar a su manera.
 */

/*
1º Pedir un numero por consola, un numero inicial y uno final y crear la tabla de multiplicar de ese número
    Vamos a proceder a hacer este ejercicio, el cual he entendido que
    tenemos que pedir 1 número por consola y después pedir 2 números que hacen un rango, para despues calcular
    la tabla de multiplicar del número pedido entre el rango pedido posteriormente
 */
fun main(){
    var res = 0
    var rango = 0 .. 1
    do{
        println("Dame un número:")
         res =(readln().toIntOrNull()?: -1)
        println("Dame un rango para la multiplicacion separado por ',' :")
        val i = readln().split(",")
        rango = (i[0].toInt() ..i[1].toInt())
    }while(res < 0)

    for(i in rango){
        println("$res x $i = ${res * i} ")
    }

}


//Pedir número de tarjeta de credito y comprobar que es una tarjeta de crédito y, posteriormente, pedir un dni y comprobar que el dni es válido.

