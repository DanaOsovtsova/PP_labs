package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaylorTest {

    @Test
    public void testMyArcsin1() {
        // Test cases for known values of arcsin
        Taylor taylor1 = new Taylor(0.5, 10);
        assertEquals(Math.asin(0.5), taylor1.MyArcsin(), 1e-10);

    }

    @Test
    public void testMyArcsin2() {
        // Test cases for known values of arcsin
        Taylor taylor2 = new Taylor(0.1, 10);
        assertEquals(Math.asin(0.1), taylor2.MyArcsin(), 1e-10);

    }

    @Test
    public void testMyArcsin3() {
        // Test cases for known values of arcsin
        Taylor taylor4 = new Taylor(0.0, 10);
        assertEquals(Math.asin(0.0), taylor4.MyArcsin(), 1e-10);

    }


    @Test(expected = IllegalArgumentException.class) //ожидает выбрпмп исключения
    public void testInvalidInput() {
        // Test for values outside the valid range for arcsin
        Taylor taylorInvalid = new Taylor(2.0, 10);
        taylorInvalid.MyArcsin(); // This should throw an exception
    }

    @Test
    public void testNegativeInput() {
        // Test for a negative value
        Taylor taylorNegative = new Taylor(-0.5, 10);
        assertEquals(Math.asin(-0.5), taylorNegative.MyArcsin(), 1e-10);
    }
}