package org.DenWorker.Java_Core._1_Basic_Syntax._1_3_Type_Conversion;

public class Task_1_3_8 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(12));
    }

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
