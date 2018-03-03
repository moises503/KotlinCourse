//This is a void function
fun hello():Unit{
    println("Hello world")
}

fun addition(a:Int, b:Int):Unit{
    println("The addition of $a plus $b is ${a+b}")
}

/*fun max(a:Int, b:Int):Int{
    return if (a > b)
        a
    else
        b
}*/

fun max(a: Int, b: Int)  = if (a > b) a else b


fun main(args: Array<String>) {
    println(max(4, 9))
}