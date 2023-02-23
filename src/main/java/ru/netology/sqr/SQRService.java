package ru.netology.sqr;

public class SQRService {

    public int calc(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int isqrt = i * i;
            if (isqrt >= min) {
                if (isqrt <= max) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
