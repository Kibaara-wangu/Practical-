fun main() {
    var greetings=add("jane","Hello")
    println(greetings)

    var addition=sum(3,4)
    println(addition)


    println(isPrime(27))


}
fun add(name:String,greeting:String):String{
    return "$name $greeting"
}
fun sum(a:Int, b:Int):Int{
    return a + b
}


fun isPrime(number: Int): Boolean {
//    if (number <= 1) {
//        return false
//    }

//    for (i in 2 until number) {
    if (number % 2 == 0) {
        return false
    }

    else {
        return true
    }
}