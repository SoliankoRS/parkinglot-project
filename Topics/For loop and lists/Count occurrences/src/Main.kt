fun main() {
    val n = readLine()!!.toInt()
    val list = MutableList(n) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    var counter = 0
    for (i in list) {
        if (i == m) counter++
    }
    println(counter)
}