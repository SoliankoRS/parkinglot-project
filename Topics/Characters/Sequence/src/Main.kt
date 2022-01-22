import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input1 = scanner.next().toCharArray()[0]
    val input2 = scanner.next().toCharArray()[0]
    val input3 = scanner.next().toCharArray()[0]

    if (input1 + 1 == input2) {
        if (input2 + 1 == input3) {
            return println(true)
        }
    }
    println(false)
}