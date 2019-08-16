class Mago(val nombre: String, val genero: String, var dano: Int, var poderMagico: Int, var vida :Int) : Player(nombre, genero, dano, vida) {
    override fun golpear() {
        println("hiya!")
        println("*ouch, pierdes $dano puntos de vida")

    }

    fun magic(naturaleza: String) {
        println("no me hagas enojar!")
        println("$nombre te lanzo un $naturaleza")
        println("Aaah! pierdes $poderMagico puntos de vida")
    }
}

class Guerrero(val nombre: String, val genero: String, var dano: Int, var critical: Int, var vida: Int) :
    Player(nombre, genero, dano, vida) {
    override fun golpear() {
        println("Aarrgh!")
        println("$nombre te ha gopeado \nouch, pierdes $dano puntos de vida")
    }
    fun golpeCritico() {
        println("Te toca sufrir!")
        println("$nombre te acerto un golpe \ngolpe critico total: ${dano+critical} de dano")
    }
}

fun main(args: Array<String>) {
    val player1 = Mago("Karol", "femenino", 15, 30,100)
    player1.hablar()
    player1.golpear()
    player1.magic("fireball")

val player2 = Guerrero("Mikko","femenino",23, 10, 100)
    player2.hablar()
    player2.golpear()
    player2.golpeCritico()





//end of Main
}