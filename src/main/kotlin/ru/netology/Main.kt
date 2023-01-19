package ru.netology

fun main() {

}

fun calcComission(moneyAccount: String = "VK pay", transferCurrMonth: Int = 0, currentTransferMoney: Int): Int {

    val limitMaestroSum = 75000
    val limitMaestroPercent = 0.006
    val limitMaestroIncrease = 20

    val limitVisaMirPercent = 0.0075
    val minComissionVisaMir = 35

    when {
        currentTransferMoney > 0 -> when (moneyAccount) {
            "VK pay" -> return 0
            "Maestro", "Mastercard" -> if (transferCurrMonth + currentTransferMoney > limitMaestroSum)
            return (currentTransferMoney * limitMaestroPercent + limitMaestroIncrease).toInt()
            else
            return 0
            "Visa", "Mir" -> if (currentTransferMoney * limitVisaMirPercent < minComissionVisaMir)
            return minComissionVisaMir
            else
            return (currentTransferMoney * limitVisaMirPercent).toInt()

        }
    }

    return 0

}