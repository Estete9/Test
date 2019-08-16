//class Gato(val nombre: String, val raza: String, val sexo: String, val edad: Int) {
//    fun detallesDelGato() {
//        println("Tengo un gato llamado $nombre, la raza es $raza, es $sexo y tiene $edad anos")
//    }
//
//    fun mayullar() {
//
//        println("Mi-auu")
//    }
//}
//
//class Perro(val nombre: String, val raza: String, val sexo: String, val edad: Int) {
//    fun detallesDelPerro() {
//        println("Tengo un perro llamado $nombre, la raza es $raza, es $sexo y tiene $edad anos")
//    }
//
//    fun ladrar() {
//
//        println("gu-au")
//    }
//}
open class Animal(val nombre: String, val numeroDePatas: Int, val tipoDeAnimal: String) {
    open fun detalles() {
        println("Esto es un $tipoDeAnimal")
        println("Se llama $nombre")
        println("tiene $numeroDePatas patas")
    }

    fun hablar(sonidoDelAnimal: String) {
        println("aah, que lindo como dice $sonidoDelAnimal :')")
    }

    fun correr() {
        println("Miralo correr!")
    }

    fun cacar() {
        println("diugh eso apesta")
    }

}

class Gato(
    val nombreDelGato: String,
    val numeroDePatasDelGato: Int,
    val tipoGato: String,
    var sonidoDelAnimal: String
) : Animal(nombreDelGato, numeroDePatasDelGato, tipoGato) {

}

class Perro(
    val nombreDelPerro: String,
    val numeroDePatasDelPerro: Int,
    val tipoPerro: String,
    var sonidoDelAnimal: String
) : Animal(nombreDelPerro, numeroDePatasDelPerro, tipoPerro)

class PerroDeLaCalle(
    val nombreDelPerroDeLaCalle: String,
    val numeroDePatasDelPerroDeLaCalle: Int,
    val tipoPerro: String,
    var sonidoDelAnimal: String
) : Animal(nombreDelPerroDeLaCalle, numeroDePatasDelPerroDeLaCalle, tipoPerro) {
    override fun detalles() {

super.detalles()
        println("Este perro no es mio pero lo queremos")
//        println("Esto es un $tipoDeAnimal")
//        println("Se llama $nombre")
//        println("tiene $numeroDePatas patas")
    }

}

fun main(args: Array<String>) {

    val bruno = Gato("Bruno", 4, "gato", "miau")
    bruno.detalles()
    bruno.hablar("miau")

    val kyno = Perro("Kyno", 4, "perro", "guau")
    kyno.detalles()
    kyno.hablar("guau")

    val vinnie = PerroDeLaCalle("Vinnie", 4, "perro", "no dice nada")

    vinnie.detalles()
    vinnie.correr()
    vinnie.hablar("no dice nada")

//    val miGato = Gato("Bruno", "desconocido", "macho", 2)
//    miGato.detallesDelGato()
//    miGato.mayullar()
//    val miPerro = Perro("Kyno", "desconocido", "macho", 1)
//    miPerro.detallesDelPerro()
//    miPerro.ladrar()


//    end of Main
}