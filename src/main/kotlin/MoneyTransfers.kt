fun main() {
    val amount = 500_000
    val bankCard = "Mastercard"
    val result = if (bankCard !== "VK Pay")  if (amount * 0.0075 > 35*100) amount * 0.0075 else 35*100 else 0
    println("Комиссия: ${result.toInt()} копеек")
}