package org.DenWorker.Java_Core._1_Basic_Syntax._1_4_Conditional_Operators_and_Loops;

public class Task_1_4_10 {
    public static void main(String[] args) {
        System.out.println(isWeekend("Monday"));
        System.out.println(isWeekend("Saturday"));
    }

    public static boolean isWeekend(String weekday) {
        return switch (weekday) {
            case "Saturday", "Sunday" -> true;
            default -> false;
        };
    }
}
