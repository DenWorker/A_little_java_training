package org.DenWorker.Java_Core._1_Basic_Syntax._1_4_Conditional_Operators_and_Loops;

public class Task_1_4_12 {
    public static void main(String[] args) {
        System.out.println(checkWeekend("Monday"));
        System.out.println(checkWeekend("Saturday"));
    }

    public static String checkWeekend(String weekday) {
        return (weekday.equals("Sunday") || weekday.equals("Saturday")) ? ("Ура, выходной!") : ("Надо еще поработать");
    }

}
