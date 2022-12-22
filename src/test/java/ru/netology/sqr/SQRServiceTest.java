package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testSqrLowerBorderSpan() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqr(199, 299);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSqrHighBorderSpan() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqr(201, 301);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSqrUntilSpan() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.calcSqr(0, 199);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSqrAfterSpan() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqr(400, 500);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSqrZeroSpan() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqr(0, 0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSqrNullSpanNumberExists() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calcSqr(289, 289);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSqrNullSpanNumberNotExists() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqr(211, 211);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSqrSpanNumberNotExists() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqr(226, 255);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSqrNegativSpan() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqr(-200, -300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSqrMixedSpan() {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.calcSqr(-200, +300);
        Assertions.assertEquals(expected, actual);
    }
}
