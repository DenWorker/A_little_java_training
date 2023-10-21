package org.DenWorker.Java_Core._1_Basic_Syntax._1_3_Type_Conversion;

public class Task_1_3_2 {
    public static void main(String[] args) {
        System.out.println(charExpression(44));
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
