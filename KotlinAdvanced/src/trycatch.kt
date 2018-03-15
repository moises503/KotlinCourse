data class Person(val name: String, val age : Int)

fun isNumber(data : Any?) = data is Int || data is Int?

fun fail(message : String) : Nothing{
    throw IllegalArgumentException(message)
}

fun main(args: Array<String>) {
    /*println("Print anything:")
    val num:Any ? = try {
        readLine()?.toInt()
    } catch (e : NumberFormatException){
        "No Int"
    }

    print("Var ")
    println(num)
    print("Function ")
    println(isNumber(num))*/

    var name = ""
    val person : Person? = null
    try{
        name = person?.name ?: fail("Name is required")
    } catch (e : IllegalArgumentException){
        println(e)
        println(name)
    }
}