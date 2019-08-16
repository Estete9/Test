fun main(args: Array<String>) {
    val s = "The Only Hope is Lost at the End"
    println(s)

    println("this is an escaped char \" with \\ and a symbol not that already has a meaning in string printing")

    val rawCrawl = """
         saviors get lost
         storms strike from the back
         beating strums in the ear

    """.trimIndent()

    println(rawCrawl)

//    for (char in s){
//        println(rawCrawl)
//    }


    val contentEquals = s.contains("lost", true)
    if(contentEquals) {
        println( "well it's true that all is lost")
    }

    val uppercase = s.toUpperCase()
    val lowercase = s.toLowerCase()
    println("$s is original, $uppercase is in Upper case and $lowercase is in lowercase")

    val subSequence = s.subSequence(9, 14)
    println(subSequence)

    println("Feeling are always lost to ${subSequence.toString().toUpperCase()}")

}