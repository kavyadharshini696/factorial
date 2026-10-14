
package com.example;

public class Factorial {

    public static long findFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Number must be non-negative");
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " = "
                + findFactorial(n));
    }
}
