package org.DenWorker.Java_Core._1_Basic_Syntax._1_2_Primitive_Types;

public class Task_1_2_13 {
    public static void main(String[] args) {
        calcCircleRadius(123);
        System.out.println();
        calcCircleRadius(10);
    }

    public static void calcCircleRadius(double area) {
        System.out.printf("%.3f", Math.sqrt(area / Math.PI));
    }
}
