fun main() {
    val input1 = readLine()!!.toInt()
    val input2 = readLine()!!.toInt()
    println(if (input2 == 0) "Division by zero, please fix the second argument!" else input1 / input2)
}