package org.DenWorker.Java_Core._2_OOP._2_4_Inheritance_and_Polymorphism;

public class Task_2_4_11 {
    public static void main(String[] args) {
        LazyStudent student = new LazyStudent();
        student.study();
    }

    public static class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    public static class LazyStudent extends Student {
        public LazyStudent() {
        }

        @Override
        public void study() {
            System.out.println("Сегодня не учусь, мне лень.");
        }
    }
}
