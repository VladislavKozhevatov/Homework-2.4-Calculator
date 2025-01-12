package com.example.Calculator.controller;

import com.example.Calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private CalculatorService calculatorService = new CalculatorService();

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "calculator")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public Integer plus(@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public Integer minus(@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public Integer multiply(@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/devide")
    public double devide(@RequestParam(value = "num1") double num1, @RequestParam(value = "num2") double num2) {
        return calculatorService.devide(num1, num2);
    }

}




