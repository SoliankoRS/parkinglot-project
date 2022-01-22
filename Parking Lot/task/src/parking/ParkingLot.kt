package parking

class ParkingLot {

    private var parkingLot = MutableList<Spot>(0) { Spot(numSpot = it + 1) }

    var numCarsInParkingLot = 0

    inner class Spot(val numSpot: Int) {

        var parkingCar: Car? = null

        val isFree: Boolean
            get() {
                return parkingCar == null
            }

        fun takeASpot(car: Car): Boolean {
            if (!isFree) return false
            this.parkingCar = car
            numCarsInParkingLot++
            println("${car.color} car parked in spot $numSpot.")
            return true
        }

        fun freeSpot(): Boolean {
            if (isFree) {
                println("There is no car in spot $numSpot.")
                return false
            }
            this.parkingCar = null
            numCarsInParkingLot--
            println("Spot $numSpot is free.")
            return true
        }

        fun showSpotStatus() {
            if (!isFree) {
                println("$numSpot ${parkingCar?.regNumber} ${parkingCar?.color}")
            }
        }
    }

    fun executeCommand(command: String, params: List<String>): Boolean {
        // TODO: check isParkingLotNotCreate && command == create || command == exit before when
        when (command) {
            "park" -> {
                if (isParkingLotNotCreate()) {
                    val regNumber = params[0]
                    val color = params[1]
                    val car = Car(regNumber, color)
                    for (spot in parkingLot) {
                        if (spot.takeASpot(car)) return true
                    }
                    println("Sorry, the parking lot is full.")
                }
            }
            "leave" -> {
                if (isParkingLotNotCreate()) {
                    val numSpot = params[0].toInt() - 1
                    parkingLot[numSpot].freeSpot()
                }
            }
            "status" -> {
                if (isParkingLotNotCreate()) {
                    if (numCarsInParkingLot == 0) {
                        println("Parking lot is empty.")
                        return true
                    }
                    parkingLot.forEach { spot -> if (!spot.isFree) spot.showSpotStatus() }
                }
            }
            "reg_by_color" -> {
                if (isParkingLotNotCreate()) {
                    val color = params[0]
                    regByColor(color)
                }
            }
            "spot_by_color" -> {
                if (isParkingLotNotCreate()) {
                    val color = params[0]
                    spotByColor(color)
                }
            }
            "spot_by_reg" -> {
                if (isParkingLotNotCreate()) {
                    val reg = params[0]
                    spotByReg(reg)
                }
            }
            "create" -> {
                val spots = params[0].toInt()
                parkingLot = MutableList(spots) { Spot(numSpot = it + 1) }
                numCarsInParkingLot = 0
                println("Created a parking lot with $spots spots.")
            }
            "exit" -> return false
        }
        return true
    }

    private fun isParkingLotNotCreate(): Boolean {
        val result = parkingLot.isNotEmpty()
        if (!result) println("Sorry, a parking lot has not been created.")
        return result
    }

    private fun regByColor(color: String) {
        val lowercaseColor = color.lowercase()
        val result = parkingLot.filter { spot -> spot.parkingCar?.color?.lowercase() == lowercaseColor }
            .joinToString { spot -> spot.parkingCar!!.regNumber }
        if (result.isNotEmpty()) println(result)
        else println("No cars with color $color were found.")
    }

    private fun spotByColor(color: String) {
        val lowercaseColor = color.lowercase()
        val result = parkingLot.filter { spot -> spot.parkingCar?.color?.lowercase() == lowercaseColor }
            .joinToString { spot -> spot.numSpot.toString() }
        if (result.isNotEmpty()) println(result)
        else println("No cars with color $color were found.")
    }

    private fun spotByReg(reg: String) {
        val lowercaseReg = reg.lowercase()
        val result = parkingLot.filter { spot -> spot.parkingCar?.regNumber?.lowercase() == lowercaseReg }
            .joinToString { spot -> spot.numSpot.toString() }
        if (result.isNotEmpty()) println(result)
        else println("No cars with registration number $reg were found.")
    }
}