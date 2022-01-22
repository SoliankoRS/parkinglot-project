fun main() {
    val input = readLine()!!.toLowerCase()
    val counter = input.count { it in "gc" }.toDouble()
    println(counter / input.length * 100.0)
}