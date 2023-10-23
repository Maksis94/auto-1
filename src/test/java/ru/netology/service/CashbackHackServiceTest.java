package ru.netology.service;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldCalculateCashback0() {
        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void shouldCalculateCashbackBelow1000() {
        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(service.remain(900), 100);
    }

    @org.junit.Test
    public void shouldCalculateCashbackAbove1000() {
        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(service.remain(1100), 900);
    }

    @org.junit.Test
    public void shouldCalculateCashback1000() {
        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(service.remain(1000), 0);
    }
}