package org.DenWorker.Java_Core._2_OOP._2_1_Objects_and_Classes;

public class Task_2_1_6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.sayHello();
        dog.sayHello();
        System.out.println();

        dog.catchCat(cat);
        System.out.println();
    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            this.sayHello();
            cat.sayHello();
        }
    }
}
