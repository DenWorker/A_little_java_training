package org.DenWorker.Java_Core._1_Basic_Syntax._1_4_Conditional_Operators_and_Loops;

public class Task_1_4_11 {
    public static void main(String[] args) {
        System.out.println(isWeekend("Monday"));
        System.out.println(isWeekend("Saturday"));
    }

    public static boolean isWeekend(String weekday) {
        if (weekday.equals("Saturday") || weekday.equals("Sunday")) {
            return true;
        } else {
            return false;
        }
    }
}
