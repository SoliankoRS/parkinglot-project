import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val list = MutableList(n) { scanner.nextInt() }
    val p = scanner.nextInt()
    val m = scanner.nextInt()

    var currentNumber = -1
    var currentIndex = 0

    for (i in 0..list.lastIndex) {
        if (list[i] == p) {
            currentNumber = m
            currentIndex = i
            break
        } else if (list[i] == m) {
            currentNumber = p
            currentIndex = i
            break
        }
        if (i == list.lastIndex) {
            println("YES")
            return
        }
    }
    
    val start = currentIndex + 1
    for (i in start..list.lastIndex) {
        if (currentIndex + 1 == i && currentNumber == list[i]) {
            println("NO")
            return
        }

        if (list[i] == p && currentIndex + 1 < i) {
            currentNumber = m
            currentIndex = i
        } else if (list[i] == m && currentIndex + 1 < i) {
            currentNumber = p
            currentIndex = i
        }

    }
    println("YES")
}
