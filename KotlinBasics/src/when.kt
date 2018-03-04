fun main(args: Array<String>) {
    type("Hello my developer friend")
    println(whoIs(Person("Moises", 20,  "Red")))
    range(103)
}

fun type(data : Any){
    when(data){
        is String -> {
            println(data.length)
        }
        is Int -> println(data * 2)
        is Boolean -> {
            println("Is boolean")
            print(data)
        }
        is Person -> println("${data.name} ${data.age}")
        else -> println("I do not know what object it is")
    }
}

fun whoIs(person : Person) =
    when(person.name){
        "Moises", "Pedro", "Armando" -> "He can enter"
        else -> "Can not enter"
    }

fun range(num : Int) =
        when(num){
            in 1..10 -> println("This is a number in range 1 to 10")
            in 100..1000 -> println("This is a number in range 100 to 1000")
            else -> print("The number is not in range")
        }