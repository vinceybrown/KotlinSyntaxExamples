package basicsyntax

/**
 * Created by vbrown on 13/10/2016.
 */

class ClassesAndObjects {

    var name: String = "Vince"
    var address: String = "123 Somewhere Street"
    val size = 35

    // Var with custom getter and setter.
    var isNameEmpty: Boolean get() = size == 0
    set(value) {

    }



}