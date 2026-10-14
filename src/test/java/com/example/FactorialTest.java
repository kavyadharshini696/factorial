
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    @Test
    public void testFactorial() {
        assertEquals(120, Factorial.findFactorial(5));
    }

    @Test
    public void testZeroFactorial() {
        assertEquals(1, Factorial.findFactorial(0));
    }

    @Test
    public void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class,
                () -> Factorial.findFactorial(-1));
    }
}
