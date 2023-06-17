package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void test1(int expected, int income, int expenses, int threshold) {
        CalcRestService service = new CalcRestService();

        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}


/*
public class CalcRestServiceTest {
    @Test
    public void test1() {
        CalcRestService service = new CalcRestService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        CalcRestService service = new CalcRestService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}*/
