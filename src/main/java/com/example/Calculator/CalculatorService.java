package com.example.Calculator;

import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorService {


    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer num1, Integer num2) {
        int result = num1 + num2;
        return "Результат = " + num1 + "+" + num2 + "=" + result;
    }


//    public String plus (@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {

//        int result = num1 + num2;
//          if (num1 == null){
//            return "Введите значение первого слагаемого";
//        }
//        if(num2 == null){
//            return "Введите значение второго слагаемого";
//        }//
//        return "Результат = "+ num1 + "+" + num2 +"="+ result;
//    }


    //    public String minus (@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
    public String minus(Integer num1, Integer num2) {
        int result = num1 - num2;
        return "Результат = " + num1 + "-" + num2 + "=" + result;
    }


    //    public String multiply (@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
    public String multiply(Integer num1, Integer num2) {
        int result = num1 * num2;
        return "Результат = " + num1 + "*" + num2 + "=" + result;
    }


    //    public String devide (@RequestParam(value = "num1") double num1, @RequestParam(value = "num2") double num2) {
    public String devide(double num1, double num2) {
        double result = num1 / num2;
        if (num1 != 0 & num2 != 0) {
            return "Результат = " + num1 + "/" + num2 + "=" + result;
        }
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        }
        // else {
        //     return "На ноль делить нельзя!";
        // }
        return "введите значение";
    }


}
