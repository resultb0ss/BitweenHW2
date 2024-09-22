fun main() {
    val array: List<Int> = arrayListOf(1,2,3,4,5,6)

    val newArray: List<Int> = array.filter { it <= 3 }.map { it * it }

    println(newArray)

}