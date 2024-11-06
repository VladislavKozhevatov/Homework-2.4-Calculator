package com.example.Calculator;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private CalculatorService calculatorService = new CalculatorService();

    @GetMapping(path = "/calculator")
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
        return calculatorService.plus(num1,num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    String multiply(@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/devide")
    String devide(@RequestParam(value = "num1") double num1, @RequestParam(value = "num2") double num2) {
        return calculatorService.devide(num1, num2);
    }

}




