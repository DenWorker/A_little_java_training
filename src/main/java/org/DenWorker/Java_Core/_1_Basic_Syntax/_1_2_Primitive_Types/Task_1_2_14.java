package org.DenWorker.Java_Core._1_Basic_Syntax._1_2_Primitive_Types;

import java.math.BigInteger;

public class Task_1_2_14 {
    public static void main(String[] args) {
        maxLongSqr();
    }

    public static void maxLongSqr() {
        BigInteger longMaxValue = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(longMaxValue.pow(2));
    }
}
