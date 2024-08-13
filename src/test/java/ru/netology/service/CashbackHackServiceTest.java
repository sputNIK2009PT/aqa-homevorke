package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLow() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(100, service.remain(900));

    }

    @Test
    public void testRemainHigh() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(495, service.remain(1505));
    }

    @Test
    public void testRemainEquals() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void testRemainZero() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(1000, service.remain(0));
    }
}