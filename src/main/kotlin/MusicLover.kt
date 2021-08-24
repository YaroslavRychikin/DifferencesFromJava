fun main() {
    val amount = 10_000
    val musicLover = true
    val previousPurchaseAmount = 1111100
    val firstDiscount = if(previousPurchaseAmount/10 <= 10000) if(previousPurchaseAmount/10 <= 1000) amount
        else amount - 100 else amount * 0.95
    val secondDiscount = if(musicLover) firstDiscount.toInt()*0.99 else firstDiscount
    val result = if(secondDiscount.toInt()%100 === 0) "${secondDiscount.toInt()/100} рублей"
        else "${secondDiscount.toInt()/100} рублей ${secondDiscount.toInt()%100} копеек"
    println("Окончательная стоимость покупки: $result")
}
