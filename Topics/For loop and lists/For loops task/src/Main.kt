fun main() {
    val n = readLine()!!.toInt()
    val list = List(n) { readLine()!!.toInt() }
    val numbers = readLine()!!.split(' ').map { it.toInt() }
    println(if (list.containsAll(numbers)) "YES" else "NO")
}