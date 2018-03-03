class Example{
     fun hello(){
         println("Hello")
     }
}

class Employeee(val name:String){
    init {
        println("Name $name")
    }

    constructor(name: String, age:Int) : this(name){
        println("Nombre $name, edad $age")
    }
}

open class Base(val start:Int){
    open fun printSomething(){
        println("Something $start")
    }
}

class General(val d:Int) : Base(d){
    override fun printSomething() {
        super.printSomething()
        println("The addition is ${4+d}")
    }
}

fun main(args: Array<String>) {
    val employee = Employeee("Benjamin", 30)
    println(employee)
    val general = General(23)
    general.printSomething()
}