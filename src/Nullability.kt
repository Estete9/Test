fun main(args: Array<String>) {

    var name: String = "El gato dice miau"
    println(name)
    println(name.length)

//    name = null

    var nullName: String? = "El gato esta bajo el sillon"
    nullName = null

    var lengthOfNullName: Int
    if (nullName != null) {

        lengthOfNullName = nullName.length

        println(nullName.toString())

    } else {
        lengthOfNullName = -1
        println("El gato no esta bajo el sillon :'(")
    }
println(lengthOfNullName)

    val f = nullName?.length ?: -1
    val l = nullName ?: "Donde esta el gato?"
    println(l)
//!! for something youre sure it-s there, or else null pointer exception crash
//println(nullName!!.length)

//end of main
}