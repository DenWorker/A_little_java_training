package org.DenWorker.Java_Core._1_Basic_Syntax._1_6_Strings;

public class Task_1_6_10 {
    public static void main(String[] args) {
        String number1 = "64";
        String number2 = "5";
        System.out.println(parseAndSqrt(number1));
        System.out.println(parseAndSqrt(number2));
    }

    public static long parseAndSqrt(String number) {
        return Math.round(Math.sqrt(Double.parseDouble(number)));
    }
}
