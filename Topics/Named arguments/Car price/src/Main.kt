fun carPrice(
    old: Int = 5,
    kilometers: Int = 100000,
    maximumSpeed: Int = 120,
    automatic: Boolean = false
) {
    var price = 20000
    price -= old * 2000
    price -= (120 - maximumSpeed) * 100
    price -= kilometers / 10000 * 200
    if (automatic) price += 1500
    println(price)
}