fun main() {
    val productType = readLine()!!
    val price = readLine()!!.toInt()
    val product = when (productType) {
        "headphones" -> HeadPhones(price)
        "smartphone" -> SmartPhone(price)
        "tv" -> TV(price)
        "laptop" -> Laptop(price)
        else -> Product(price, -1)
    }
    println(product.totalPrice)
}

open class Product(val price: Int, val tax: Int) {

    val totalPrice: Int
        get() {
            return price + price * tax / 100
        }
}

class HeadPhones(price: Int, tax: Int = 11) : Product(price, tax)
class SmartPhone(price: Int, tax: Int = 15) : Product(price, tax)
class TV(price: Int, tax: Int = 17) : Product(price, tax)
class Laptop(price: Int, tax: Int = 19) : Product(price, tax)