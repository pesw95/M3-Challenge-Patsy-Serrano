package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldDividePositives() {

        assertEquals(3, calc.divide(6,2));
        assertEquals(2, calc.divide(80, 39));
        assertEquals(1, calc.divide(105, 100));
    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(3, calc.divide(-6,-2));
        assertEquals(2, calc.divide(-80, -39));
        assertEquals(1, calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(-3, calc.divide(6,-2));
        assertEquals(-2, calc.divide(-80, 39));
        assertEquals(-1, calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.divide(0,0));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(105, 0));
    }

// Test cases for Addition Operation

    @Test
    public void shouldAddPositiveIntegers() {
        assertEquals(10, calc.add(5,5));
        assertEquals(500, calc.add(250,250));
        assertEquals(1050, calc.add(25, 1025));
    }

    @Test
    public void shouldAddNegativeIntegers(){
        assertEquals(-12, calc.add(-6, -6));
        assertEquals(-50, calc.add(-30,-20));
        assertEquals(-450, calc.add(-225, -225));
    }
    @Test
    public void shouldAddPositiveAndNegativeInts(){
        assertEquals(30, calc.add(50,-20));
        assertEquals(100, calc.add(-90, 190));
        assertEquals(500, calc.add(-500, 1000));

    }
//    Test cases for Subtraction Operation
    @Test
    public void shouldSubtractPositiveIntegers(){
        assertEquals(15, calc.subtract(30,15));
        assertEquals(0, calc.subtract(10, 10));
        assertEquals(600, 1000, 400);
        assertEquals(-20, calc.subtract(80, 100));
    }
    @Test
    public void shouldSubtractNegativeIntegers(){
        assertEquals(-100, calc.subtract(-500, -400));
        assertEquals(-1000, calc.subtract(-3000, -2000));
        assertEquals(0, calc.subtract(-20, -20));
    }
    @Test
    public void shouldSubtractPositiveAndNegativeInts(){
       assertEquals(70, calc.subtract(50,-20));
       assertEquals(-130, calc.subtract(-100, 30));
       assertEquals(-240, calc.subtract(-50,190));
    }
//    Test cases for Multiplication Operation
    @Test
    public void shouldMultiplyPositiveInts(){
        assertEquals(40, calc.multiply(5,8));
        assertEquals(500, calc.multiply(5,100));
        assertEquals(72, calc.multiply(9,8));
    }
@Test
    public void shouldMultiplyNegativeInts(){
        assertEquals(20, calc.multiply(-4,-5));
        assertEquals(500, calc.multiply(-5,-100));
        assertEquals(300, calc.multiply(-60,-5));
}
@Test
    public void shouldMultiplyPositiveAndNegativeInts(){
        assertEquals(-15, calc.multiply(-5,3));
        assertEquals(-30, calc.multiply(5,-6));
        assertEquals(-800, calc.multiply(-400,2));
}

@Test
    public void shouldReturnZeroMultiply(){
        assertEquals(0, calc.multiply(0,-5));
        assertEquals(0, calc.multiply(-15000,0));
        assertEquals(0, calc.multiply(27,0));

}

}
