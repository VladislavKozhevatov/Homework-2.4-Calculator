package com.example.Calculator.service;
import com.example.Calculator.eception.DevideByZeroExeprion;
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

        Integer num3 = 15;
        Integer num4 = 20;
        Integer expectedResult2 =  35;

        //when
        Integer actualResult = calculatorService.plus(num1, num2);
        Integer actualResult2 = calculatorService.plus(num3,num4);

        //Then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }


    @Test
    public void minus() {
        //given
        Integer num1 = 6;
        Integer num2 = 2;
        Integer expectedResult = 4;

        Integer num3 = 40;
        Integer num4 = 25;
        Integer expectedResult2 =  15;

        //when
        Integer actualResult = calculatorService.minus(num1, num2);
        Integer actualResult2 = calculatorService.minus(num3, num4);

        //Then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }

    @Test
    public void multiply() {
        //given
        Integer num1 = 3;
        Integer num2 = 2;
        Integer expectedResult = 6;

        //given
        Integer num3 = 2;
        Integer num4 = 1;
        Integer expectedResult2 = 2;

        //when
        Integer actualResult = calculatorService.multiply(num1, num2);
        Integer actualResult2 = calculatorService.multiply(num3, num4);

        //Then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(expectedResult2, actualResult2);
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

    @Test
    public void shouldThrowExeptionIfNum2IsZero () {
        //given
        Integer num1 = 4;
        Integer num2 = 0;

        //when
        //Then
        Assertions.assertThrows(DevideByZeroExeprion.class, () -> calculatorService.devide(num1, num2));

    }

}
