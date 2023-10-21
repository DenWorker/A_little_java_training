package org.DenWorker.Java_Core._1_Basic_Syntax._1_3_Type_Conversion;

public class Task_1_3_3 {
    public static void main(String[] args) {
        System.out.println(getAgeDiff((byte) 5, (byte) 4));
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) Math.abs(age1 - age2);
    }
}
