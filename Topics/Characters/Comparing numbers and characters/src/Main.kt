fun main() {
    val num = readLine()!!.toInt()
    val char = readLine()!!.toCharArray().first().code
    println(num == char)
}