// Arquivo: src/main/java/com/example/demo/service/CalculatorService.java
package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double add(double a, double b) {
        return a + b;
    }
}