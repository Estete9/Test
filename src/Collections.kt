fun main(args: Array<String>) {
    val juguetesDelBruno = listOf("raton", "rascador", "funda")
    println(juguetesDelBruno)

    println(juguetesDelBruno.sorted())
    println(juguetesDelBruno[0])
    println(juguetesDelBruno.first())
    println(juguetesDelBruno.last())
    println(juguetesDelBruno.contains("ball"))

    val comidasDeGato = arrayListOf("Michu", "Whiskas", "Procat")
    println(comidasDeGato.size)
    comidasDeGato.add("Gato Feliz")
    comidasDeGato.add(1, "Producto X")
    println(comidasDeGato)
    println(comidasDeGato[1])
    comidasDeGato.remove("Producto X")
    println(comidasDeGato)

    val juguetesPorCantidad = mapOf("Raton" to 2, "funda" to 3, "rascador" to 1)
    println("el Gato tiene ${juguetesPorCantidad["Raton"]} ${juguetesPorCantidad.getOrDefault("Raton","no hay ese juguete")} de juguete" )
    println(juguetesPorCantidad.values)

    val juguetes = hashMapOf("Raton" to "negro", "funda" to "blanca", "rascador" to "cafe")
println(juguetes)
juguetes["Raton"] = "blanco"
    println(juguetes)
    juguetes.put("otro Raton", "negro")
    println(juguetes)
    juguetes.remove("funda")
    println(juguetes)
    println(juguetes.isEmpty())


//    end of Main
}