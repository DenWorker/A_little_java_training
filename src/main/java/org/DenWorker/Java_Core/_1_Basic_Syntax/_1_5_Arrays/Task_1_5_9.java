package org.DenWorker.Java_Core._1_Basic_Syntax._1_5_Arrays;


import java.util.Arrays;

public class Task_1_5_9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 5, 6, 7, 7};
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
