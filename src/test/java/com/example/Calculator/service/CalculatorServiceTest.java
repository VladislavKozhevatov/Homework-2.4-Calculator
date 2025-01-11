package com.example.Calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
//        public void plus() {
//            //arrange
//            var calculator = new CalculatorService();
//            //act
//            var result = calculator.plus(2, 5);
//            //assert
//            Assertions.assertArrayEquals(7, 7);
//        }

    public void plus() {

        //given
        Integer num1 = 2;
        Integer num2 = 3;
        Integer expectedResult = 5;

        //when
        Integer actualResult = calculatorService.plus(num1, num2);

        //Then
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void minus() {
        //given
        Integer num1 = 3;
        Integer num2 = 2;
        Integer expectedResult = 1;

        //when
        Integer actualResult = calculatorService.minus(num1, num2);

        //Then
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
