package org.DenWorker.Java_Core._6_Functional_Interfaces_and_Streams_API._6_2_Stream_API;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Task_6_2_15 {
    public static void main(String[] args) {
        System.out.println(factorial(50));
    }

    public static BigInteger factorial(int value) {
        return Stream.iterate(BigInteger.valueOf(1), i -> i.add(BigInteger.valueOf(1)))
                .limit(value)
                .reduce(BigInteger::multiply)
                .orElse(BigInteger.valueOf(1));
    }
}
