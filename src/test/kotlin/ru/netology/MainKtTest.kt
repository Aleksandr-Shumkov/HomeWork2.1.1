package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcWrongComission() {
        assertEquals(32, calcComission(currentTransferMoney = 25000))
        assertEquals(35, calcComission("Maestro", currentTransferMoney = 50000))
        assertEquals(45, calcComission("Mastercard", 65000, 25000))
        assertEquals(35, calcComission("Visa", currentTransferMoney = 30000))
        assertEquals(25, calcComission("Mir", currentTransferMoney = 4000))
        assertEquals(32, calcComission(currentTransferMoney = -25000))
    }

    @Test
    fun calcGoodComission() {
        assertEquals(0, calcComission(currentTransferMoney = 25000))
        assertEquals(0, calcComission("Maestro", currentTransferMoney = 50000))
        assertEquals(170, calcComission("Mastercard", 65000, 25000))
        assertEquals(225, calcComission("Visa", currentTransferMoney = 30000))
        assertEquals(35, calcComission("Mir", currentTransferMoney = 4000))
        assertEquals(0, calcComission(currentTransferMoney = -25000))
    }

}