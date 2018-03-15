data class Car(val color : String, val whels : Int, val doors : Int)

fun main(args: Array<String>) {
    val myCar:Car? = Car("red", 4, 4)

    myCar?.let {
        it.doors
        with(it){
            color
            whels
            doors
        }
    }

    with(myCar){

    }
    val result = addition(4, 7)
    val resultMinFour = minFour("hola")
    println(result)
    println(resultMinFour)
}

val addition : (Int, Int) -> Int = { x, y -> x + y}

val minFour: (String) -> Boolean = { it.length > 4 }