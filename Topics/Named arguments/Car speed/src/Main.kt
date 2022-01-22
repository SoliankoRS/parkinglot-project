fun checkLimit(currentSpeed: Int, speedLimit: Int) {
    println(
        if (currentSpeed > speedLimit) {
            "Exceeds the limit by ${currentSpeed - speedLimit} kilometers per hour"
        } else "Within the limit"
    )
}

const val DEFAULT_SPEED_LIMIT = 60

fun main(args: Array<String>) {
    val currentSpeed = readLine()!!.toInt()
    val speedLimit = readLine()!!
    if (speedLimit == "no limit") {
        checkLimit(currentSpeed, DEFAULT_SPEED_LIMIT)
    } else checkLimit(currentSpeed, speedLimit.toInt())
}