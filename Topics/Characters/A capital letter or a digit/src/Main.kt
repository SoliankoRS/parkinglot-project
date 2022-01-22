fun main() {
    val input = readLine()!!.first()
    println(input in 'A'..'Z' || input in '1'..'9')
}