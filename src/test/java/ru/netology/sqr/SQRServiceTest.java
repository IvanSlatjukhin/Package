package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    SQRService sqrService = new SQRService();

    @Test
    void calculateSQR() {
        int expected = 3;
        int actual = sqrService.calculateSQR(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresExceedingMinimumLimit() {

        int expected = 0;
        int minNumb = 10;
        int maxNumb = 99;

        int actual = sqrService.calculateSQR(minNumb, maxNumb);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNumberOfSquaresMinimumLimit() {
        SQRService service = new SQRService();

        int expected = 1;
        int minNumb = 100;
        int maxNumb = 100;

        int actual = sqrService.calculateSQR(minNumb, maxNumb);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNumberOfSquaresMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 81;
        int minNumb = 100;
        int maxNumb = 8101;

        int actual = sqrService.calculateSQR(minNumb, maxNumb);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresExceedingMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 22;
        int minNumb = 100;
        int maxNumb = 1000;

        int actual = sqrService.calculateSQR(minNumb, maxNumb);

        assertEquals(expected, actual);
    }
}