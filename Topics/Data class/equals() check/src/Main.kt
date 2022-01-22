data class Client(val name: String, val age: Int, val balance: Int)

fun main() {
    val name1 = readLine()!!
    val age1 = readLine()!!.toInt()
    val balance1 = readLine()!!.toInt()
    val client1 = Client(name1, age1, balance1)

    val name2 = readLine()!!
    val age2 = readLine()!!.toInt()
    val balance2 = readLine()!!.toInt()
    val client2 = Client(name2, age2, balance2)

    println(client1.name == client2.name && client1.age == client2.age)
}