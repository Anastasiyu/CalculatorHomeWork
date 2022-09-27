package com.example.calculatorhomework.controller.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServicelmpl implements CalculatorService {
    @Override
    public int plus(int a, int b) {
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }
    @Override
    public double divide(int a, int b) {
        return (double) a / b;
    }
}

