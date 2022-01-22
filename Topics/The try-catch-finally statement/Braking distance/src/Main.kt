import kotlin.math.abs

fun calculateBrakingDistance(v1: String, a: String): Int {
    try {
        val v1Int = v1.toInt()
        val aInt = a.toInt()
        if (aInt == 0) throw ArithmeticException()
        return v1Int * v1Int / abs(aInt * 2)
    } catch (e: ArithmeticException) {
        println("The car does not slow down!")
    } catch (e: Exception) {
        println(e.message)
    }
    return -1
}