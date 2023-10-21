package org.DenWorker.Java_Core._1_Basic_Syntax._1_4_Conditional_Operators_and_Loops;

import java.math.BigInteger;

public class Task_1_4_8 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.ONE;
        } else {
            BigInteger result = factorial(value - 1);
            return result.multiply(BigInteger.valueOf(value));
        }
    }
}
