open class Player(val name: String, val gender: String, var attack: Int, var health : Int) {
    open fun hablar() {
        println("Pero, Muy buenos dias! :)\n Mi nombre es $name")
    }

    open fun golpear() {
        println("Toma!")
        println("-5 vida (ouch)")
    }


}