package com.example.calculatorhomework.controller;


import com.example.calculatorhomework.controller.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping()
    public String hello() {
        return "Привет! Ты вкалькуляторе!";
    }


    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1") int a,
                       @RequestParam(name = "num2") int b) {
        int plus = calculatorService.plus(a,b);
        return a + " + " + b + " = " + plus;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1") int a,
                        @RequestParam(name = "num2") int b) {
        int minus = calculatorService.minus(a,b);
        return a + " - " + b + " = " + minus;

    }

    @GetMapping("r/multiply")
    public String multiply(@RequestParam(name = "num1") int a,
                           @RequestParam(name = "num2") int b) {
        int multiply = calculatorService.multiply(a,b);
        return a + " * " + b + " = " + multiply;

    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1", required = false) int a,
                         @RequestParam(name = "num2", required = false) int b) {
        if (b==0) return "На ноль делить нельзя";
        double divide =calculatorService.divide(a,b);
        return a + " / " + b + " = " + divide;

    }
}


