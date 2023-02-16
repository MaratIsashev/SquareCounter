package ru.netology.sqr;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

//import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void LowAndHighNotZero(int expected, int low, int high) {

        SQRService service= new SQRService();
        //int expected = 3;
        int actual= service.calcSquareNum(low,high);
        assertEquals(expected, actual);


    }
/*    @org.junit.jupiter.api.Test
    public void LowZeroHighNotZero() {

        SQRService service= new SQRService();
        int expected = 3;
        int actual= service.calcSquareNum(0,10);
        assertEquals(expected, actual);


    }
    @org.junit.jupiter.api.Test
    public void LowAndHighZero() {

        SQRService service= new SQRService();
        int expected = 0;
        int actual= service.calcSquareNum(0,0);
        assertEquals(expected, actual);


    }
    @org.junit.jupiter.api.Test
    public void LowEqualHighNotZero() {

        SQRService service= new SQRService();
        int expected = 0;
        int actual= service.calcSquareNum(200,200);
        assertEquals(expected, actual);


    }*/
/*
    @org.junit.jupiter.api.Test
    public void LowAndHighBorderNotZero() {

        SQRService service= new SQRService();
        int expected = 3;
        int actual= service.calcSquareNum(200,289);
        assertEquals(expected, actual);
*/


    }
