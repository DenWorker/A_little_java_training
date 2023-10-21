package org.DenWorker.Java_Core._1_Basic_Syntax._1_2_Primitive_Types;

public class Task_1_2_10 {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 0.0001;
    }
}
