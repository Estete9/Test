fun main(args: Array<String>) {
    val sumA ={x: Int, y:Int->x+y}
    println(sumA(1,2))

    val sumB:(Int,Int)->Int = {a,b->a-b}
println(sumB(3,1))


//    end of Main
}