data class Time(val years: Int, val days : Int)

operator fun Time.plus(other : Time) : Time{
    return Time(this.years + other.years,
            this.days + other.days)
}

data class Count(val index : Int){
    operator fun inc() : Count{
        return Count(index + 1)
    }
}


fun main(args: Array<String>) {
    val time1 = Time(2000, 30)
    val time2 = Time(100, 2)
    val totalTime = time1 + time2
    println(totalTime)

    var count = Count(5)
    println(count.inc())
    println(++count)
}