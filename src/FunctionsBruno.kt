fun main(args: Array<String>) {
    fun meows() {
        println("\nBruno te regresa a ver y Bruno dice:\n\"miau\"")
    }
    meows()
    fun brunoAnswersBackWhenAddressed(line: String) {
        println("\nRegresas a ver a Bruno y dices:\n \"Mi-auuu\" \nBruno responde:\n \"$line\"")
    }
    brunoAnswersBackWhenAddressed("Miau?")

    fun brunoCalculatesWhoIsInTheLivingRoomWithoutHim(humans: Int, dogs: Int): Int {
        val flatmantes = humans + dogs
        return flatmantes
    }

    val flatmantes = brunoCalculatesWhoIsInTheLivingRoomWithoutHim(2, 1)
    println("\nBruno observa $flatmantes personas en la sala y desde afuera dice: \n\"MIAAUUUUU?\"")
    println(
        "\nBruno observa ${brunoCalculatesWhoIsInTheLivingRoomWithoutHim(
            2,
            1
        )} personas en la sala y desde afuera dice: \n\"MIAAUUUUU?\""
    )
    fun brunoFeels(mood: String = "Distante") {
        println("Bruno se siente $mood")
    }
    brunoFeels()
    brunoFeels("ignorado")
    brunoFeels("feliz")


//Main ends here
}