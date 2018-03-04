fun main(args: Array<String>) {
    val a = isGreater(6)
    defineType("Hello developers")
}


fun isGreater(data:Int):Boolean =
    if(data > 0){
        println("$data")
        true
    } else {
        println("$data")
        false
    }

//Any is like Object in java
fun defineType(data : Any){
    if(data is String){
        print(data.length)
    } else if(data is Int){
        print(data * 2)
    } else if(data is Employeee){
        print(data.name)
    }
}
/*fun isGreater(data:Int):Boolean{
    if(data > 0){
        println("$data")
        return true
    } else {
        println("$data")
        return false
    }
}*/