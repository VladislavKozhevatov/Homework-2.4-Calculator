package com.example.Calculator.service;

import com.example.Calculator.eception.DevideByZeroExeprion;
import org.springframework.stereotype.Service;


@Service
public class CalculatorService implements CalculatorServiceInterface {


    public Integer plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return Integer.valueOf("одно или оба значений равны нулю");
        }
        int result;
        return result = num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return Integer.valueOf("одно или оба значений равны нулю");
        }
        int result = num1 - num2;
        return Integer.valueOf("Результат = " + num1 + "-" + num2 + "=" + result);
    }


    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return Integer.valueOf("одно или оба значений равны нулю");
        }
        int result = num1 * num2;
        return Integer.valueOf("Результат = " + num1 + "*" + num2 + "=" + result);
    }

    public double devide(double num1, double num2) {
        double result = num1 / num2;
        if (num1 != 0 & num2 != 0) {
            return Integer.valueOf("Результат = " + num1 + "/" + num2 + "=" + result);
        }
        if (num1 == 0 || num2 == 0) {
            throw new DevideByZeroExeprion("Делить на ноль нельзя");
        }
        return Integer.valueOf("введите значение");
    }


}
