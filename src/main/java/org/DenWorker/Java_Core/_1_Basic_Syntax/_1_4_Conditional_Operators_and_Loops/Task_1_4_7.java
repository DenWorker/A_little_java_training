package org.DenWorker.Java_Core._1_Basic_Syntax._1_4_Conditional_Operators_and_Loops;

import java.math.BigInteger;

public class Task_1_4_7 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}