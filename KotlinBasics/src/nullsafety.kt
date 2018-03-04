fun main(args: Array<String>) {
    var a:String = "abcd"
    var b:String? = "abcd"
    b = null

    val lA = a.length
    val lB = b?.length ?: 0

    println(lA)
    println(lB)

    val person:Person? = Person("Lolo", 24, "Brown")
    val name = person?.name

    person?.let {
        println("Is not null")
    }

    person.let {
        println("Is null")
    }
}