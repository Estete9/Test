fun main(args: Array<String>) {
    val comidasDeGato = arrayListOf("Michu", "Whiskas", "Procat")
    val juguetes = hashMapOf("Raton" to "negro", "funda" to "blanca", "rascador" to "cafe")

    for(comida in comidasDeGato){
        println("Que rico es $comida")
    }

    for ((key,value) in juguetes){
        println("el Bruno tiene un $key de color $value")
    }
    var x = 2
    while (x<10){
        println("X es igual a $x")
        x++
    }
}