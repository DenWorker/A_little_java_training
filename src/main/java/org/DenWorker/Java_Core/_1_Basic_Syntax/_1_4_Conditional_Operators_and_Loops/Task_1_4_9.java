package org.DenWorker.Java_Core._1_Basic_Syntax._1_4_Conditional_Operators_and_Loops;

public class Task_1_4_9 {
    public static void main(String[] args) {
        System.out.println("gg");
    }

    public int determineGroup(int age) {
        return (age >= 7 && age <= 13) ? (1) : ((age >= 14 && age <= 17) ? (2) : ((age >= 18 && age <= 65) ? (3) : (-1)));
    }
}
