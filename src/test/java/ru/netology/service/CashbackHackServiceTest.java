package ru.netology.service;

import org.testng.annotations.Test;

class CashbackHackServiceTest {

    @Test
    void remaining() {
        CashbackHackService service = new CashbackHackService();
        int amount = 50;
        int expected = 950;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual,expected);
    }

    @Test
    void remainingError() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual,expected);
    }
}