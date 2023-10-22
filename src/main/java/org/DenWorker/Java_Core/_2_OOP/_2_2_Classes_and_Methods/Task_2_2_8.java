package org.DenWorker.Java_Core._2_OOP._2_2_Classes_and_Methods;

public class Task_2_2_8 {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String dayName1 = "Wednesday";
        String dayName2 = "Saturday";

        System.out.println(isWeekend(dayName1));
        System.out.println(isWeekend(dayName2));

        System.out.println(weekendCount(days));
        System.out.println(weekdayCount(days));

    }

    public static boolean isWeekend(String dayName) {
        return switch (dayName) {
            case "Saturday", "Sunday" -> true;
            default -> false;
        };
    }

    public static int weekendCount(String[] days) {
        int result = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                result++;
            }
        }
        return result;
    }

    public static int weekdayCount(String[] days) {
        return days.length - weekendCount(days);
    }

}
