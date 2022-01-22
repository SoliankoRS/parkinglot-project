fun main() {
    val n = readLine()!!.toInt()
    val list = MutableList(n) { readLine()!!.toInt() }
    val shifts = readLine()!!.toInt() % n
    repeat(shifts) {
        list.add(0, list.last())
        list.removeLast()
    }
    println(list.joinToString(" "))
}