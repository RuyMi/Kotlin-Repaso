package es.ruymi.ProgramacionFuncional


/*
Funcion idempotente
Es una función que conserva la propiedad f(f(x)) = f(x). Es decir, su empleo hace que una operacion pueda ser repetida
tantas veces sin causar efectos secundarios.

Las funciones se pueden usar como tipo.
 */


fun main(){
    println(suma(1,2))
    val miSuma= :: suma
    println(miSuma(1,2))

    val resta = fun(a: Int,b: Int): Int {return a - b}
    println(resta(1,2))
    println(funcionQueTieneParametroFuncion(1,2, resta))

    //----------------------------------------------------------------

    println(12.isEven())
}

fun funcionQueTieneParametroFuncion(a: Int, b: Int, c: (Int, Int) -> Int): Int { return c(a,b) }
// fun funcionQueDevuelveFuncion()

fun suma(a: Int, b: Int): Int {
    return a + b
}


//Funciones de extensión

/*
Nos permite extender las funcionalidades sin heredar de la clase
 */

fun Int.isEven() = this % 2 == 0





