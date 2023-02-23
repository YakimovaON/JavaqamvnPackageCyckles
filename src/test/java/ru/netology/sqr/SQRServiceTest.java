package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testFewSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNoOneSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(20, 80);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOneSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(100, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncorretSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(300, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(10, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAllSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(100, 10000);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }
}




