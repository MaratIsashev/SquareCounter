package ru.netology.sqr;

public class SQRService {

    public int calcSquareNum(int low, int high) {

        int squareNum=0;
        for (int i=1;i <= high; i++) {
            if ((i*i) >= low & (i*i) <= high) {
                squareNum++;
            }
        }

        return squareNum;
    }
}
