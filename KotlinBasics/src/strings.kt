fun main(args: Array<String>) {
    val str = "This is a simple string"
    val name = "Moises"
    val age = 25

    val sentence = "He is $name and he is $age years old"
    val birthday = "He is ${age + 1}"
    println(sentence)
    println(birthday)
    /*val text = """
        |This is a large text and i like print
        |this variable in the console an has
        |some lines
    """.trimMargin()*/
    val text = """
        This is a large text and i like print
        this variable in the console an has
        some lines
    """.trimIndent()
    println(text)
}