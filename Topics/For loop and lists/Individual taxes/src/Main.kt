fun main() {
    val n = readLine()!!.toInt()
    val annualIncome = MutableList(n) { readLine()!!.toInt() }
    val percentageTaxes = MutableList(n) { readLine()!!.toInt() }
    var maxTax = annualIncome[0] * percentageTaxes[0]
    var numCompanyMaxTax = 1
    for (i in 1 until n) {
        val currentCompanyTax = annualIncome[i] * percentageTaxes[i]
        if (currentCompanyTax > maxTax) {
            maxTax = currentCompanyTax
            numCompanyMaxTax = i + 1
        }
    }
    println(numCompanyMaxTax)
}