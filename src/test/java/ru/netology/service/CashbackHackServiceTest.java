package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateCashback0() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldCalculateCashbackBelow1000() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(900), 100);
    }

    @Test
    public void shouldCalculateCashbackAbove1000() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(1100), 900);
    }

    @Test
    public void shouldCalculateCashback1000() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(1000), 0);
    }


    @org.junit.Test
    public void shouldCalculateCashback0JUnit4() {
        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void shouldCalculateCashbackBelow1000JUnit4() {
        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(service.remain(900), 100);
    }

    @org.junit.Test
    public void shouldCalculateCashbackAbove1000JUnit4() {
        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(service.remain(1100), 900);
    }

    @org.junit.Test
    public void shouldCalculateCashback1000JUnit4() {
        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(service.remain(1000), 0);
    }
}