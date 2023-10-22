package org.DenWorker.Java_Core._2_OOP._2_4_Inheritance_and_Polymorphism;

public class Task_2_4_9 {
    public static void main(String[] args) {
        JavaStudent javaStudent = new JavaStudent();
        javaStudent.study();
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

    public static class JavaStudent extends Student {
        public JavaStudent() {
            super("Прохожу курс по Java.");
        }
    }
}
