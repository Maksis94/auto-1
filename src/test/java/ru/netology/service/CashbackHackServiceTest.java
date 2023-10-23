package ru.netology.service;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void shouldCalculateCashback0() {
        CashbackHackService service = new CashbackHackService();

        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void shouldCalculateCashbackBelow1000() {
        CashbackHackService service = new CashbackHackService();

        org.testng.Assert.assertEquals(service.remain(900), 100);
    }

    @org.testng.annotations.Test
    public void shouldCalculateCashbackAbove1000() {
        CashbackHackService service = new CashbackHackService();

        org.testng.Assert.assertEquals(service.remain(1100), 900);
    }

    @org.testng.annotations.Test
    public void shouldCalculateCashback1000() {
        CashbackHackService service = new CashbackHackService();

        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }
}
