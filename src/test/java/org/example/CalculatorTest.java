package org.example;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAddTrue() throws Exception{
        Calculator calc = new Calculator();
        int actualValue = calc.add(5, 10);
        int expectedValue = 15;


        assertTrue(actualValue == expectedValue);


    }

    public void testAddFalse() throws Exception{
        Calculator calc = new Calculator();
        int actualValue = calc.add(5, 10);
        int expectedValue = 2;


        assertFalse(actualValue == expectedValue);
        //assertTrue(actualValue != expectedValue);

    }

    public void testAddException() throws Exception{
        Calculator calc = new Calculator();

        try{
            int actualValue = calc.add(15, 20);
            assertFalse(false);

        } catch(Exception ex){
            assertTrue(true);

        }







    }




}