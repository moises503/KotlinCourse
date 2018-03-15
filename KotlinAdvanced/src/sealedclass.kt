/*sealed class Intent{
    class Refresh:Intent()
    class Reload:Intent()
}

fun main(args: Array<String>) {
    val intent:Intent = Intent.Refresh()
    val output = when(intent){
        is Intent.Refresh -> "Refresh"
        is Intent.Reload -> "Reload more data"
    }

    println(output)
}*/

sealed class Intent{
    object Reload:Intent(){
        override fun log() {
            println("Reload")
        }
    }


    object ReloadMoreData:Intent(){
        override fun log() {
            println("Reload more data")
        }
    }

    data class Error(val reason: String) : Intent(){
        override fun log() {
            println("$reason")
        }
    }

    abstract fun log()
}

fun main(args: Array<String>) {
    val intent:Intent = Intent.ReloadMoreData
    val output = when(intent){
        is Intent.ReloadMoreData -> "Reload more data"
        is Intent.Reload -> "Reload"
        is Intent.Error -> "Error"
    }

    intent.log()

    println(output)
}