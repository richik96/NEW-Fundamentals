package com.telusko.learning;


import static org.junit.Assert.*;

import org.junit.Test;


public class CalcTest {

    @Test
    public void testName() {

        Calc c = new Calc();
        int result = c.divide(10, 2);
        assertEquals(5, result);
    }

}
