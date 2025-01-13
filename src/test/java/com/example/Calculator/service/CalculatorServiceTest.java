package com.example.Calculator.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plus() {

        //given
        Integer num1 = 2;
        Integer num2 = 3;
        Integer expectedResult = 5;

        //when
        Integer actualResult = calculatorService.plus(num1, num2);

        //Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void minus() {
        //given
        Integer num1 = 6;
        Integer num2 = 2;
        Integer expectedResult = 4;

        //when
        Integer actualResult = calculatorService.minus(num1, num2);

        //Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multiply() {
        //given
        Integer num1 = 3;
        Integer num2 = 2;
        Integer expectedResult = 6;

        //when
        Integer actualResult = calculatorService.multiply(num1, num2);

        //Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void devide() {
        //given
        Integer num1 = 4;
        Integer num2 = 2;
        double expectedResult = 2.0;

        //when
        double actualResult = calculatorService.devide(num1, num2);

        //Then
        Assertions.assertEquals(expectedResult, actualResult);

    }
}
