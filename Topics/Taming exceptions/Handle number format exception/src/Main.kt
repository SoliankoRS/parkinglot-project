fun parseCardNumber(cardNumber: String): Long {
    val regex = "(\\d{4}\\s){3}\\d{4}".toRegex()
    if (regex.matches(cardNumber)) {
        return cardNumber.filterNot { it.isWhitespace() }.toLong()
    } else throw Exception()
}