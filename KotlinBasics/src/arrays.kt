
fun main(args: Array<String>) {
    //Inmutable Arrays and lists
    val arrayA = intArrayOf(1, 2, 3, 4, 55, 66, 77)
    val listA = arrayListOf("One", "Two", "Three")
    val number = arrayA[0]
    arrayA[2] = 20

    val mutableList = mutableListOf(2, 3, 5, 6, 77, 778)
    mutableList.add(9)
    mutableList.add(2, 100)
    mutableList[0] = 2

    val map = mutableMapOf<String, Int>(Pair("key", 30))
    map.put("key2", 40)
}