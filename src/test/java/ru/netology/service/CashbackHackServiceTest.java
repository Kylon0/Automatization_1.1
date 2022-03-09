package ru.netology.service;

import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void remaining() {
        CashbackHackService service = new CashbackHackService();
        int amount = 50;
        int expected = 950;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual,expected);
    }

    @Test
    public void remainingError() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual,expected);
    }
}