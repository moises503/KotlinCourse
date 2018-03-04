data class Familiar(val name:String ="Moises", val age:Int = 25, val hairColor:String = "Brown")

data class Result(val result:Int, val status:Boolean)

fun calc(a:Int, b:Int):Result{
    if(a*2>b){
        return Result(a*2, true)
    } else {
        return Result(a*2, false)
    }
}

fun main(args: Array<String>) {
    //val (name, age, color) = Familiar()

    val (name, _, color) = Familiar()
    println(name)
    println(color)

    val (res, status) = calc(4, 3)

    println(res)
    println(status)
}