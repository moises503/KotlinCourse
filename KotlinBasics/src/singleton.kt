object Validations{
    fun isValidPassword(pwd:String) = pwd.isNotEmpty()  && pwd.length < 10
    fun isNumber(data:Any) = data is Int
}

class UniversalClass{
    companion object {
        fun create():UniversalClass = UniversalClass()
    }
}

fun main(args: Array<String>) {
    println("Enter a password: ")
    var pwd:String = readLine() ?: ""
    println("Enter a number: ")
    try {
       var number:Int = readLine()?.toInt() ?: 0
       println("Is valid password ${Validations.isValidPassword(pwd)}")
       println("Is a number ${Validations.isNumber(number)}")
    }catch (e:NumberFormatException){
       println(e)
    }

    val universalClassSingleton = UniversalClass.create()
}

