fun main() {
    val input1 = readLine()!!.toInt()
    val input2 = readLine()!!.toInt()
    val input3 = readLine()!!.toInt()
    if (input2 <= input3) {
        println(input1 in input2..input3)
    } else {
        println(input1 in input3..input2)
    }
}