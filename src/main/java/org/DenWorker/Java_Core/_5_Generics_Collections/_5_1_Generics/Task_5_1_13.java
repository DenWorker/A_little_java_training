package org.DenWorker.Java_Core._5_Generics_Collections._5_1_Generics;

public class Task_5_1_13 {
    public static void main(String[] args) {
        System.out.println("gg");
    }

    public static class Box<T> {
        private T object;

        public static <T> Box<T> getBox() {
            return new Box<>();
        }
    }

}
