fun addition(num: Int, num2: Int, func: () -> Unit){
    println("The plus $num and $num2 = ${num + num2}")
    func()
}

/*fun String.someFunction(func: (String) -> Unit){
    func(this)
    println(this.length)
}*/

fun String.someFunction(func: String.() -> Unit){
    this.func()
    println(this.length)
}

fun main(args: Array<String>) {
    /*"Hola".someFunction {
        println(it)
    }*/
    "Hola".someFunction {
        println(length)
    }
    addition(6, 8){
        println("High order function")
    }
}