package ru.netology.sqr;

public class SQRService {

    public int rangeNum(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit) {
                if (i * i <= upperLimit) {
                    counter = counter + 1;
                }
            }
        }
        System.out.println("Количество удовлетворяющих чисел равно " + counter);
        return counter;
    }
}
