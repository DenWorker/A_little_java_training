package org.DenWorker.Java_Core._6_Functional_Interfaces_and_Streams_API._6_1_Functional_Interfaces;

public class Task_6_1_10 {
    public static void main(String[] args) {
        System.out.println(getGenerator().cond(5));
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return (t) -> t.intValue() > 0;
    }

    interface NumberGenerator<T extends Number> {
        boolean cond(T arg);
    }

}
