package com.example.Calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class CalculatorServiceParametrizedTest {

    private final CalculatorService calculatorService = new CalculatorService();

    private static Stream<Arguments> argumentProvider(){
        return Stream.of(
                Arguments.of(5,7),
                Arguments.of(20,10),
                Arguments.of(2,4),
                Arguments.of(100,50)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void plus(int num1, int num2) {
        //given
        Integer expectedResult = num1 + num2;

        //when
        Integer actualResult = calculatorService.plus(num1,num2);

        //then
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void minus(int num1, int num2){
        //given
        Integer expectedResult = num1 - num2;

        //when
        Integer actualResult = calculatorService.minus(num1,num2);

        //then
        Assertions.assertEquals(expectedResult,actualResult);

    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void multiply(int num1, int num2){
        //given
        Integer expectedResult = num1 * num2;

        //when
        Integer actualResult = calculatorService.multiply(num1,num2);

        //then
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void devide (double num1, double num2){
        //given
        double expectedResult = num1 / num2;

        //when
        double actualResult = calculatorService.devide(num1,num2);

        //then
        Assertions.assertEquals(expectedResult,actualResult);

    }
}
