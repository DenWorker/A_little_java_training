package org.DenWorker.Java_Core._2_OOP._2_1_Objects_and_Classes;

public class Task_2_1_7 {
    public static void main(String[] args) {
        Day day1 = Day.MONDAY;
        Day day2 = Day.WEDNESDAY;
        Day day3 = Day.SATURDAY;
        Day day4 = Day.SUNDAY;

        System.out.println(day1.getRusName());
        System.out.println(day1.isWeekend());
        System.out.println();

        System.out.println(day2.getRusName());
        System.out.println(day2.isWeekend());
        System.out.println();


        System.out.println(day3.getRusName());
        System.out.println(day3.isWeekend());
        System.out.println();


        System.out.println(day4.getRusName());
        System.out.println(day4.isWeekend());
        System.out.println();

        // Имеется доступ, т.к. перечисление и метод находятся внутри одного класса.
        System.out.println(day1.rusName);
    }

    public enum Day {
        MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

        private final String rusName;

        Day(String rusName) {
            this.rusName = rusName;
        }

        public String getRusName() {
            return this.rusName;
        }

        public boolean isWeekend() {
            return switch (this) {
                case SATURDAY, SUNDAY -> true;
                default -> false;
            };
        }

    }

}

