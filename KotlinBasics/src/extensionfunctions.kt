fun main(args: Array<String>) {
    "Hello my name is Moises".print()
    println(5.multipy(3))
    println(8 multipy 2)
    val someList = mutableListOf("Moises", "Espejo", "Braulio")
    someList.swap(0, 2)
    println(someList.toString())
}

fun <T> MutableList<T>.swap(index1 : Int, index2 : Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

infix fun Int.multipy(num:Int):Int{
    return this * num
}

fun String.print(){
    println(this)
}