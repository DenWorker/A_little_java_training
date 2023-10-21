package org.DenWorker.Java_Core._1_Basic_Syntax._1_5_Arrays;

public class Task_1_5_3 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 5, 6, 7, 7};
        int[] numbers2 = {1};
        int[] numbers3 = {};

        printArray(numbers1);
        printArray(numbers2);
        printArray(numbers3);

        System.out.println();

        secondPrintArray(numbers1);
        secondPrintArray(numbers2);
        secondPrintArray(numbers3);
    }

    public static void printArray(int[] numbers) {
        StringBuilder result = new StringBuilder("[");
        for (int iterator : numbers) {
            result.append(iterator).append(", ");
        }
        if (numbers.length != 0) {
            result.delete(result.length() - 2, result.length());
        }
        result.append("]");
        System.out.println(result);
    }

    public static void secondPrintArray(int[] numbers) {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < numbers.length - 1; i++) {
            result.append(numbers[i]).append(", ");
        }

        if (numbers.length != 0) {
            result.append(numbers[numbers.length - 1]).append("]");
        } else {
            result.append("]");
        }

        System.out.println(result);
    }
}
