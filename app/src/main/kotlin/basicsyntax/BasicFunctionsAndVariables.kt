package basicsyntax

/**
 * Created by vbrown on 12/10/2016.
 *
 * Covers basic syntax, local variable declaration and control of flow examples.
 */

class BasicFunctionsAndVariables {

    // Basic function.
    fun basicFunction() {
        println("Basic function")
    }

    // Function with parameter.
    fun functionWithParam(param: String) {
        println("Hello " + param)
        var obj: ClassesAndObjects = ClassesAndObjects()
        val boo = obj.isNameEmpty
    }

    // Function with nullable (?) parameter.
    fun functionWithNullableParameter(param: String?){
        if(param != null) {
            println("Hello" + param)
        }
    }

    // Function with inferred type and expression body.
    fun sum(a: Int, b: Int) = a + b

    // Function that returns no meaningful value (Unit is void equivalent).
    fun doSomething(a: Int, b: Int): Unit {
        println("Sum " + a + b)
    }

    fun localVariables() {
        // Immutable.
        val a: Int = 1
        val b = 5 // Type is inferred.
        val c: Int // Type is needed when no initilaiser is provided.
        var d = 1 // Mutable with inferred type.
    }

    val a: Int = 5
    val b: Int = 10

    val max = if (a > b) a else b

    // Function with 'when' expression - equivalent to 'switch'
    fun whenExpression(a: Int) {
        when(a) {
            1 -> println("a == 1")
            2 -> println("a == 2")
            3 -> println("a == 3")
            else -> {
                println("a is niether 1, 2 or 3")
            }
        }
    }
}