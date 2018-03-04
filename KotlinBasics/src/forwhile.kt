fun main(args: Array<String>) {
    val numbersList = intArrayOf(1, 2, 4, 5, 6, 7, 8, 9, 10)
    for(i in numbersList.indices){
        println(numbersList[i])
    }
    val fruits = listOf("Apple", "Pineapple", "Grapes", "Banana")

    for (fruit in fruits){
        println(fruit)
    }

    var x = 3
    while (x > 0){
        x--
        println(x)
    }

    var add:Int = 0
    var input:String? = ""
    do{
        print("Type a number: ")
        input = readLine()
        add += input?.toInt() ?: 0
    }while (input != "0")

    println("The addition is $add")
}