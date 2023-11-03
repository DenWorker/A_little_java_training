package org.DenWorker.Java_Core._6_Functional_Interfaces_and_Streams_API._6_1_Functional_Interfaces;

import java.util.function.UnaryOperator;

public class Task_6_1_9 {
    public static void main(String[] args) {
        System.out.println(new Task_6_1_9().sqrt().apply(5));
    }

    public UnaryOperator<Integer> sqrt() {
        return (t) -> t * t;
    }

}
