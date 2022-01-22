package parking

fun main() {
    val parkingLot = ParkingLot()
    do {
        val input = readLine()!!.split(' ')
        val command = input[0]
        val params = input.subList(1, input.size)
    } while (parkingLot.executeCommand(command, params))
}