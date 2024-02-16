package com.example.spe_calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpeCalculatorApplicationTests {

//    @Test
//    void testSquareRoot() {
//        SpeCalculatorApplication calculatorApplication = new SpeCalculatorApplication();
//        assertEquals(5.0,calculatorApplication.squareRoot(25.0));
//    }

    @Test
    void testSquareRoot() {
        SpeCalculatorApplication calculatorApplication = new SpeCalculatorApplication();
        assertEquals(5.0, calculatorApplication.squareRoot(25.0));
        assertEquals(0.0, calculatorApplication.squareRoot(0.0));
    }

    @Test
    void testFactorial() {
        SpeCalculatorApplication calculatorApplication = new SpeCalculatorApplication();
        assertEquals(1, calculatorApplication.factorial(0));
        assertEquals(1, calculatorApplication.factorial(1));
    }

    @Test
    void testNaturalLogarithm() {
        SpeCalculatorApplication calculatorApplication = new SpeCalculatorApplication();
        assertEquals(1.0, calculatorApplication.naturalLogarithm(Math.E));
    }

    @Test
    void testPowerFunction() {
        SpeCalculatorApplication calculatorApplication = new SpeCalculatorApplication();
        assertEquals(8.0, calculatorApplication.powerFunction(2.0, 3.0));
        assertEquals(1.0, calculatorApplication.powerFunction(5.0, 0.0));
    }

}
