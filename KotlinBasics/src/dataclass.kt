data class Car(var brand:String, private var doors:Int){
    var numDoors = doors
    get(){
        return if(field > 0) field else 1
    }
}
//val only return getters
//var return getters ans setters

data class Person(var name:String, var age:Int, var eyesColor:String)

fun main(args: Array<String>) {
    val car = Car("Ford", 0)
    var brand = car.brand
    car.brand = "Ferrari"
    println(car.toString())
    println(car.numDoors)
    car.numDoors = 3
    println(car.numDoors)

    val alejandro = Person("Alejandro", 32, "black")
    println(alejandro)
    val espejo:Person = alejandro.copy("Espejo")
    println(espejo)
    val braulio:Person = alejandro
    braulio.name = "Braulio"
    println(braulio)
    println("---------------")
    println(alejandro)
    println(espejo)
}