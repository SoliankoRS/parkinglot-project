import kotlin.math.absoluteValue

fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt().coerceIn(0..1_000_000)
    val house = when (rooms) {
        1 -> Cabin(rooms, price)
        2, 3 -> Bungalow(rooms, price)
        4 -> Cottage(rooms, price)
        5, 6, 7 -> Mansion(rooms, price)
        8, 9, 10 -> Palace(rooms, price)
        else -> House(rooms, price)
    }
    println(house.totalPrice())
}

open class House(val rooms: Int, val price: Int) {

    var coefficient = 1.0

    fun totalPrice(): Int = (price * coefficient).toInt()
}

class Cabin(rooms: Int, price: Int) : House(rooms, price) {
    init {
        coefficient = 1.0
    }
}

class Bungalow(rooms: Int, price: Int) : House(rooms, price) {
    init {
        coefficient = 1.2
    }
}

class Cottage(rooms: Int, price: Int) : House(rooms, price) {
    init {
        coefficient = 1.25
    }
}

class Mansion(rooms: Int, price: Int) : House(rooms, price) {
    init {
        coefficient = 1.4
    }
}

class Palace(rooms: Int, price: Int) : House(rooms, price) {
    init {
        coefficient = 1.6
    }
}