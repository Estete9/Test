fun main(args: Array<String>) {
    fun elBrunoSeSiente (mood: String="Distante"){
        when (mood) {
            "Distante" -> println("El Bruno esta $mood")
            "Alegria" -> println("El Bruno se hecha y rueda de $mood")
            "Asustado" -> println("El Bruno se esconde porque esta $mood")
        else -> println("El gato no entiende y no hace nada")
        }
    }

elBrunoSeSiente("Alegria")
//final de Main
}