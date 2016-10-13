package basicsyntax

/**
 * Created by vbrown on 13/10/2016.
 */

class VisibilityModifiers {

    // Default visibility is 'public' - this property will be visible everywhere.
    var hello: Int = 5

    // Only visiblt within this file
    private var anotherVar: String = "another"

    // Only visible withing this module
    internal var int: Int = 10

    // Public integer with a setter only visible within this class
    var bye: String = "bye"
        private set
}