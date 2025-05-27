// Arquivo: src/test/java/com/example/demo/service/CalculatorServiceTest.java
package com.example.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAdd() {
        double result = calculatorService.add(2.5, 3.5);
        assertEquals(6.0, result, 0.001);
    }
}