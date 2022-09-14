package es.ruymi

fun main (){
    //Variables
    val numero: Int = 123
    val caracter: Char = 'c'
    val mensaje= "chocolate"
    val mensajeNumero = "123"
    val booleano: Boolean = true

    println("Las variables definidas son las siguientes: $numero , $caracter , $mensaje , $booleano")

    var nombre = "Ruben"
    println("Nombre: $nombre")
    nombre = "Manolo"
    println("Ahora me llamo: $nombre")
    val owner = "Ruben"
    //owner = "Manolo" // Esto no se puede hacer, ya que un value es una constante.

    //Casteos
    val numero5 = numero.toDouble()
    println("numero5 = $numero5")
    val numero3 = mensajeNumero.toInt()
    println("Numero 3: $numero3")

    //Nulls
    val pruebaNull: String? = null
    println("pruebaNull: $pruebaNull")

    //Arrays
    val array = Array(5) { i -> i+1}
    println("array: $array")
    val matriz = Array(3) {Array(5) { i -> i+2} }
    println("matriz: $matriz")

    //Rangos

    val rango1 = 1..10
    println("rango1: $rango1")
        //Tambien se puede poner un rango descendente
    val rango2 = 1
    println("rango2: $rango2")

    //Operador elvis (Para asignar un valor por defecto si es null
    val edad3 = numero5?: 3

    println(mensaje?.length)
    println(mensaje!!.toString())
    // println(mensaje.length? : "No se ha especificado")

    //Anotaciones para traer codigo de java a kotlin @NotNullable @Nullable

    //When (switch en java)


    //While. Bucle indefinido
    while (numero < 6){
        println("El numero es menor que 6")
    }

    //Do while. Bucle indefinido

    do{
        println("El numero es menor que 10")
    }while(numero < 10)

    //For, incluso con rangos
    for(i in 1 .. 10){
        println(i)
    }
    for(i in 0 until 10){
        println(i)
    }
    for(i in 1 .. 10 step 2){
        println(i)
    }

    //For each
    val enteros = IntArray(10)

    for (i in enteros){
        println(i)
    }

    for(i in enteros.reversed()){
        println(i)
    }
    for(i in enteros.indices){
        println(enteros[i])
    }


    //Para no usar for, se puede utilizar el repeat para repetir x cantidad de veces

    repeat(10){
        println(3)
    }

    //Funciones y procedimientos
    //El dato Unit es el el void de java

    fun procedimientos(){
        println("Procedimiento que devuelve Unit")
    }
    procedimientos()

    //Expression Body

    fun miFuncion2() = "Esto es una expression body"
    val prueba = miFuncion2()
    println(prueba)

    //Parametros nombrado
   fun  parametros(nombre: String, edad: Int = 18, repetidor: String = "No"){ println("Prueba")}

    println(parametros("Pedro", 19,  repetidor= "No"))



    //Pedir un numero por consola, un numero inicial y uno final y crear la tabla de multiplicar de ese número
    //Pedir número de tarjeta de credito, dni



    //Inmutable. Para que una lista sea inmutable utilizar List.of, Map.of...

    // Para instanciar mas tarde debemos usar lazy siempre con val, y lateinit con var

}