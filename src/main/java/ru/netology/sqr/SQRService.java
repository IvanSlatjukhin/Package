package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int minNumb, int maxNumb) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minNumb) {
                if (i * i <= maxNumb) {
                    counter = counter + 1;
                }
            }
        }
        System.out.println("counter");
        return counter;
    }
}

