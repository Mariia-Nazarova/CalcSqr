package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int x, int y) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= x) && (i * i <= y)) {
                counter++;
            }
        }
        return counter;
    }
}


