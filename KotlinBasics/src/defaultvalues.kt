fun greet(greeting : String = "Hello all"){
    println(greeting)
}

fun someFunction(age:Int = 0, isAdult:Boolean = false, hasClothes:Boolean = true){

}

data class SomeClass(val someVal : Int = 20)

fun main(args: Array<String>) {
    greet("Hello kotlin developers")
    greet()
    someFunction(18, true, false)
    someFunction(isAdult = true, age = 18, hasClothes = false)
    someFunction(isAdult = true)
    someFunction(30, isAdult = false)

    val someObject = SomeClass()
    println(someObject.someVal)
}