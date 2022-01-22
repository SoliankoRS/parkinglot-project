fun main() {
    val input1 = readLine()!!.toInt()
    val input2 = readLine()!!.toBoolean()
    println(input1 in 10..20 && !input2 || input1 in 15..25 && input2)
}