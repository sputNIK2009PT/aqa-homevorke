package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLow() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(900), 100);

    }

    @Test
    public void testRemainHigh() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1505), 495);
    }

    @Test
    public void testRemainEquals() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1000), 0);
    }
}